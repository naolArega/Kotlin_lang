class Alien{
    var skills: String = "null";

    fun printMySkills(){
        print(skills);
    }

    // object extension
    companion object{
        fun announce(): String{
            return "hello world";
        }
    }
}

fun main(){
    var alienInstance = Alien();

    alienInstance.skills = "super strength";
    alienInstance.printMySkills();
    print(alienInstance.addMySkills(alienInstance));

    println("announcement :: " + Alien.announce());
}

// function extension
fun Alien.addMySkills(alien: Alien): String{
    var localAlienInstance = Alien();

    localAlienInstance.skills = this.skills + " " + alien.skills;

    return localAlienInstance.skills;
}   