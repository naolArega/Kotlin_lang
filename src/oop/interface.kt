interface IAnimal{
    var name: String;

    fun eat();

    fun myName();
}

class Human(val humanName: String): IAnimal{
    override var name: String = humanName;

    override fun eat(){
        println("cheers");
    }

    override fun myName(){
        println("my name is $name");
    }
}

class Dog(val dogName: String): IAnimal{
    override var name: String = dogName;

    override fun eat(){
        println("yam yam")
    }

    override fun myName(){
        println("woof woof $name");
    }
}

// multiple inheritance through interfaces
interface IOne{
    fun addNum(numOne: Int, numTwo: Int): Int{
        return numOne + numTwo;
    }
}

interface ITwo{
    fun multiplyNum(numOne: Int, multiple: Int): Int{
        return numOne * multiple;
    }
}

class MathClass: IOne, ITwo
// end of multiple inheritance through interfaces

fun main(){
    val dogInstance: Dog = Dog("jax");
    val humanInstance: Human = Human("j. trump");

    dogInstance.eat();
    humanInstance.eat();

    dogInstance.myName();
    humanInstance.myName();

    // multiple inheritance through interfaces

    val mathInstance: MathClass = MathClass();

    println("adding :: " + mathInstance.addNum(4, 8));
    println("multiplying ::" + mathInstance.multiplyNum(5, 3));
}