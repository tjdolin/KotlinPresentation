package ArraysAndLists

fun main(args: Array<String>){

    val a =arrayOf(4,5,6) //create and array
    val b = mutableListOf("a", "b", "c") //create a list
    val c = listOf(b) //create an immutable list

    for(i in a) println(i)

    println(c)

    b.add("d") // add an item to the mutable list

    println(c) // immutable list should be updated

    println("${a.get(1)}, ${a[2]}") // can use .get() and [] to access elements



}