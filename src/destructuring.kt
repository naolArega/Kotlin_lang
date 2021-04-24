data class Person(val nameArg: String, val ageArg: Int){
    var name: String = nameArg;
    var age: Int = ageArg;
}

fun main(){
    val person: Person = Person("not yet defined", 0);

    val (name, age) = person;

    println("name is ${name}");
    println("and age is ${age}");
}