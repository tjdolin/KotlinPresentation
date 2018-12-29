package functions

import java.lang.Math as m

fun main(args : Array<String>){

    println("1 + 2 = ${sum(1,2)}")
    println("5 - 3 = ${difference(5,3)}")

    println(m.abs(-31))

}

// top level function (does not require a class)
fun sum(a: Int, b: Int) : Int{

    return a+b

}
// if function is short enough you can use =
fun difference(a: Int, b:Int) = a - b