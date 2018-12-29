package Classes

fun main(args : Array<String>){

    val riley = Person("Riley", 34)

    println(riley.name)

    riley.name = "Ted" //calls setter

    println(riley.name) //calls getter

    println(riley.age)

    riley.printAge()


}