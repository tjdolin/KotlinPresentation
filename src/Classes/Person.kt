package Classes

class Person (name: String = "Bob", age: Int = 62){

    var name = name
        // custom setter
        set(value){
            field = "Bill" //must use keyword field
        }

    var age: Int = age
        get() = field * 2

    fun printAge(){
        // getter is always accessed
        println(age)

    }

}