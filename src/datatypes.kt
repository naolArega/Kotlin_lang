fun main(args: Array<String>){
    // number types
    val myInt: Int = 90;
    val myDouble: Float = 3.15f;
    val myByte: Byte = 1;

    println("$myInt \n");
    println("$myDouble \n");
    println("$myByte \n");

    // char type
    val myChar: Char = 'A';

    println("$myChar \n");

    // boolean type
    val myBoolean: Boolean = false;

    println("$myBoolean \n");

    // string type
    val myString: String = "kotlin";

    println("$myString \n");

    // array type
    val myCharArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o');
    val myIntArray: Array<Int> = arrayOf<Int>(2, 6, 9);

    for(myCharItem in myCharArray){
        println("$myCharItem \n");
    }
    for(myIntItem in myIntArray){
        println("$myIntItem \n");
    }

    // collection type
    val myList: List<Boolean> = listOf<Boolean>(true, false, false);
    val myMutableList: MutableList<Float> = mutableListOf<Float>(9.2f, 3.15f);

    for(myBooleanItem in myList){
        println("$myBooleanItem \n");
    }
    for(myFloatItem in myMutableList){
        println("$myFloatItem \n");
    }

    // range type
    val myRange: IntRange = 3..9;

    for(myIntRangeItem in myRange){
        println("$myIntRangeItem \n");
    }
}