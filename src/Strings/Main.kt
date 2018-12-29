package Strings

fun main(args:Array<String>){

    val s = "whatever"
    var b = String()
    b = b + s

    println(b)
    println(s)

    // tests whether s and b are the same reference
    println(s===b)
    // tests whether s and b are equivalent
    println(s==b)

    // escaped string
    println("hello\nworld")
    // raw string
    println("""hello\nworld""")

    val a = 10
    // string template
    println("$a * 4 = ${a * 4}")

}