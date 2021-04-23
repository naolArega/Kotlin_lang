import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

interface IBase{
    fun printHello();
}

class Foot(val value: Int): IBase{
    override fun printHello(){
        println("value is $value");
    }
}

class Derived(base: IBase): IBase by base

// proprty delegation
val propertyDeleg: String by lazy{
    "Hello"
}

// delegation observable
class User{
    var name: String by Delegates.observable("foo bar"){
        prop, old, new -> 
        println("$old -> $new");
    }
}

class Delegate{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String{
        return "$thisRef, has delegated ${property.name}";
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String){
        println("$value just assigned to ${property.name} in $thisRef");
    }
}

class Eg{
    var proprt: String by Delegate();
}

fun main(){
    val baseInstance = Foot(56);
    Derived(baseInstance).printHello();

    println("$propertyDeleg world");

    val userInstance = User();

    userInstance.name = "foo";
    userInstance.name = "bar";

    val eg: Eg = Eg();
    eg.proprt = "hello world";
    println("example proprt is $eg.proprt");
}