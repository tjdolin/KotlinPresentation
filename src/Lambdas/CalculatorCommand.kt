package Lambdas

data class CalculatorCommand(val a:Int,val b:Int, val operation:(Int, Int)->Int){

    val answer = operation(a,b)

}