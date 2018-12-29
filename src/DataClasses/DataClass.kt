package DataClasses

// uses keyword data
data class DataClass(val someData : String, val otherData : Int){

    val moreData = true

    fun calculateStuff() : DataClass{

        return DataClass("Something", 47)

    }

}