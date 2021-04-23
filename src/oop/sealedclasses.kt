sealed class MyLittleSealed{
    class OPTIONONE: MyLittleSealed();
    class OPTIONTWO: MyLittleSealed();
}

fun main(){
    val sealedInstance: MyLittleSealed = MyLittleSealed.OPTIONTWO();

    val selectedOption = when(sealedInstance){
        is MyLittleSealed.OPTIONONE -> {
            "this is option one"
        }
        is MyLittleSealed.OPTIONTWO -> {
            "this is option two"
        }
    }

    println(selectedOption);
}