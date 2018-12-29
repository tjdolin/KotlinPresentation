package nullable

fun main(args: Array<String>){

    // string initialized with null
    var s : String? = null

    // safe call
    println(s?.length)

    s = "something"

    // non-null assertion
    println(s!!.length)

    val l = listOf("things", null, "whatever")

    println(l)

    println(l.filterNotNull())

}