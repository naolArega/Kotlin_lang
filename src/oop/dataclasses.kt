data class City(val name: String, val population: Int, val area: Float)

fun main(){
    val city: City = City("addis ababa", 10000000, 1000.32f);

    println("name of the city is " + city.name);
    println("with population of " + city.population);
    println("and area of " + city.area);

    println("summing everything up " + city.toString());
    println("hash of the city is " + city.hashCode());
}