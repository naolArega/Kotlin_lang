// only accessible from this file and this file only
private class PrivateClass{
    private val privateMember: String = "this is private member";

    private fun bar(): String{
        return "foo";
    }
}

// protected
open class ClassOne{
    protected open val key: String = "secret";
}

class ClassTwo: ClassOne(){
    fun tryKey(): String{
        return key;
    }
}

// internal
class ClassInternal{
    internal val something: String = "foo bar";
}

fun main(){
    val classTwoInstance = ClassTwo();

    println("the key is " + classTwoInstance.tryKey());
}