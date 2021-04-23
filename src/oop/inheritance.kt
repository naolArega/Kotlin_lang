open class Animal{
    open public fun eat(){
        println("yam yam");
    }
}

class Human: Animal(){
    public fun talk(){
        println("howdy");
    }
    override public fun eat(){
        println("cheers");
    }
}

fun main(){
    var humanInstance: Human = Human();

    humanInstance.talk();
    humanInstance.eat();
}