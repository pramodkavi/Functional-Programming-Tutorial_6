object Tutorial_6  extends App{

//  Alphabet in upper case
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


//  Encrypt Function
    val encrypt = (C:Char,key:Int,alphbt:String)=> alphbt((alphbt.indexOf(C.toUpper)+key) % alphbt.size);

//  Decrypt Function
    val decrypt = (C:Char,key:Int,alphbt:String)=> alphbt((alphbt.indexOf(C.toUpper)-key) % alphbt.size);


//  Cipher function
    val cipher = (algo:(Char,Int,String)=>Char,inputString:String,key:Int,alphbt:String)=>inputString.map(algo(_,key,alphbt))

        val enc= cipher(encrypt,"Kavindu",3,alphabet)
        println("Encrypt : "+enc)

        val dec = cipher(decrypt,enc,3,alphabet)
        println("Decrypt : "+dec)
    
}
