package reflection

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.functions
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

fun main(args:Array<String>) {

    val c = ArrayList::class

    println(c)

    println(c.supertypes)
    println(c.memberProperties)

    println(c.functions)

    val d = ReflectionClass::class

    println(d)

    //prints super classes
    println(d.supertypes)

    // prints properties in ReflectionClass
    for (i in d.memberProperties)println(i)

    // prints functions in ReflectionClass
    for (i in d.functions)println(i)

    val e = d.functions.toList()

    // creates and instance of ReflectionClass and calls its first function
    println(e[0].call(d.createInstance()))



}