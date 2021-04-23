// regular function
fun combineStrings(primary: String, second: String): String{
    return "${primary}${second}";
}

//lambda function
val lambdaFun: (String)->Unit = {str: String -> print(str)}

// inline fun
fun inlineFun(value: String, callback: (String)->Unit){
    callback(value);
}

fun main(){
    var result = combineStrings("hello", ", world");

    println(result);

    var value: String = "foo bar";

    lambdaFun(value);

    inlineFun("world hello", lambdaFun);
}