package Loops

import java.lang.Integer.parseInt

fun main(args: Array<String>) {

    // use of range in for loop
    for (i in 1..3) println(i)

    // uses step modifier
    for (n in 0..10 step 3) {

        // when used in place of switch statement
        when (n % 2) {

            1 -> println("n is odd")
            0 -> println("n is even")

        }

        // when used instead of if, elseif
        when {
            n % 2 == 0 -> println("even")
            else -> println("odd")
        }

    }

    // with example
    val withClass = WithClass()
    with(withClass) {

        doSomething()
        doSomethingElse()
    }

}