class GenericsExample<genericType>(input: genericType){
    init{
        println("hello world => " + input);
    }
}

class Gnrcs<out T>(input: T){
    init{
        println("input === $input");
    }
}

fun main(){
    val integer: Int = 1;
    val number: Number = integer;

    print(number);

    var genericsEgInst = GenericsExample<String>("and universe");
    var genericsEgInst2 = GenericsExample<Int>(52);

    var projectType = Gnrcs<Int>(23);
}