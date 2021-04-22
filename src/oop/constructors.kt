fun main(){
    // primary constructor
    var animalInstance: Animal = Animal("sapien", 90);
    animalInstance.animalStat();
    
    // secondary constructor
    var vehicleInstance: Vehicle = Vehicle("truck", 500);
    vehicleInstance.vehicleReport();
}

class Animal(val species: String, val age: Int){
    fun animalStat(){
        println("the species is $species is $age years old!");
    }
}

class Vehicle(val type: String, val hp: Int){
    val year: String = "2009";
    constructor(type: String, hp: Int, year: String):this(type, hp){
    }

    fun vehicleReport(){
        println("$type vehicle, with $hp hourse power manufactured in $year");
    }
}