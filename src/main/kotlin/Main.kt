fun main(){
    myString("AkiraChix")
    println(statement("Grace", 25))
    println(getStringLength("Grace Wambui"))
    printName("Grace" )
    printName("John")
    printName("grace")

}
//Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string
fun myString (Inst: String){
    val campus= Inst[0]+"" +Inst[2]+"" +Inst[3]
    println(campus)
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.

fun statement(name:String, age:Int):String{
    val statement = "Hi, my name is $name and I am $age years old"
    return statement
}
//Write a function that takes in a String and returns its length
fun getStringLength(name: String):Int{
    return name.length
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”
fun printName(name: String, ) {
    if (name == "Grace") {
        println("That's me")
    } else {
        println("I don't know who that is")
    }
}





