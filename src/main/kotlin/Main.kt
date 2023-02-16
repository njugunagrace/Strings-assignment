fun main(){
    val Inst = "AkiraChix"
    println(Inst[0]+"" +Inst[2]+"" +Inst[3])


    println(statement("Grace", "25"))
    val Stringlength = getStringLength("Akirachix")
    println(Stringlength)
    printName("Grace" )
    printName("John")
}

fun statement(name:String, age:String):String{
    val statement = "Hi, my name is $name and I am $age years old"
    return statement
}

fun getStringLength(InputString: String):Int{
    return InputString.length
}

fun printName(name: String, ) {
    if (name == "Grace") {
        println("That's me")
    } else {
        println("I don't know who that is")
    }
}





