class MyClass{
    // property (memeber variable)
    private var name: String = "kotlin lang";

    // method
    fun printName(){
        println("your name is " + name);
    }
}

class OuterClass{
    class InnerClass{
        fun hello(){
            println("hell, world");
        }
    }
}

class Outer{
    private val helloWorld: String = "hello earth!";
    inner class Nested{
        fun foo() = helloWorld;
    }
}

interface Human{
    fun shout();
}

fun main(){
    val myClassInstance = MyClass();
    myClassInstance.printName();
    
    // inner classes are considered as static
    OuterClass.InnerClass().hello();

    val value = Outer().Nested().foo();
    println(value);

    // anonymous class
    val kidInstance: Human = object:Human{
        override fun shout(){
            println("hhhhhhhhhhhhhhhha");
        }
    }

    kidInstance.shout();
}