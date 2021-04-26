### Object oriented part of kotlin

```kotlin
class Foo(val name: String, val age: Int){
    public fun eat(){
        println("${name} is eating, don't disturb")
    }
}

fun main(){
    val foo = Foo("Bar", 86)

    foo.eat()
}
```