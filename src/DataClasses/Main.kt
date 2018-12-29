package DataClasses

fun main(args: Array<String>){

    val data = DataClass("Stuff", 14)

    //can return multiple values simultaneously
    val (data1, data2) = data

    println("data contains $data or $data1 and $data2")

    val (data3, data4) = data.calculateStuff()

    println("$data3, $data4")

}