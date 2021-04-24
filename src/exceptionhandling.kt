fun main(){
    try{
        val foo: Int = 12;
        val bar: String = "7";

        val parsed: Int = bar.toInt();
        println("parsed bar ${parsed}");
    }
    catch(e: Exception){
        e.printStackTrace();
    }
    finally{
        println("Exception handling in kotlin");
    }
}