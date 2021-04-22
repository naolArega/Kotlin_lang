fun main(args: Array<String>){
    // if else condition
    val num: Int = 8;
    val cond: Int = 7;

    if(num == cond){
        println("they are the same");
    }
    else{
        println("they are not the same at all");
    }

    // when condition
    val whenCond: Int = 9;

    when(whenCond){
        1 -> {
            println("the number is 1");
        }
        5 -> {
            println("the number is 5");
        }
        9 -> {
            println("the number is 9");
        }
        else -> {
            println("none of the numbers match");
        }
    }

    // for loop
    val items = 2..9;

    for(i in items){
        println("item $i");
    }

    // while loop
    var lastItem = 9;

    println("looping \n");
    while(lastItem > 0){
        println(".");
        lastItem--;
    }
    println("\n end of loop");

    // do while loop
    var doWhileItem = 8;

    println("do looping \n")
    do{
        println("do .");
        doWhileItem--;
    }
    while(doWhileItem > 0);
    println("\n end of do while loop");

    // return, break and continue
    val rtrn = someFunction(3);

    println("$rtrn");

    println("break and continue");
    myLabel@ for(i in 1..5){
        if(i == 3){
            println("if number is " + i + " closing operation");
            break@myLabel
        }
        else{
            println("else");
            continue@myLabel
        }
    }
}

fun someFunction(num: Int): Int{
    return num * 9;
}