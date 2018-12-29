package Lambdas

fun main(args:Array<String>){

    // lambda examples
    val sum = {a:Int,b:Int -> a + b}
    val difference = {a:Int, b:Int -> a - b}
    val multiply = {a:Int, b: Int -> a * b}
    val divide = {a:Int, b:Int -> a / b}

    // constructor that takes a lambda
    val randomCommand = CalculatorCommand(3,4,sum)

    println("6 * 7 = ${multiply(6,7)}")


    val (a, b, _) = randomCommand
    println("$a + $b = ${randomCommand.answer}")

    val names = listOf("Alex", "Mike", "Bill", "Molly", "George")

    // lambda used on a sequence
    val mNames = names.filter{it.startsWith("m", ignoreCase = true)}

    println(mNames)

}