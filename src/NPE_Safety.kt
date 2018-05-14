class NPE_Safety {

    class TestClass(var name: String)

    fun nullableTypeExample() {
        val test: TestClass? = null

        test?.name = "Hello"
    }

    fun tryNullAssign() {
        var a: String = "Abc"
        //a = null // Compilation Error

        // Nullable data type with "?" sign
        var b : String? = "Cba"
        b = null //Ok

        // ACCESSING VARS
        val lengthA = a.length
     //   val lengthB = b.length  // Error

        //Accessing works if perform null check

        if(b != null && b.length > 0) {
            print("b length is : ${b.length}")
        } else {
            print("Empty string")
        }

        //Accessing works with "Safe Calls"
        val safeLength = b?.length
                    //Safe chain access  // objectA?.objectB?.value = callFunction()
                                            //Won't work if any object is null
    }



    fun elvisOperator() : Int? {
        var a: String = "Abc"
        var b : String? = "Cba"

        val l: Int = if(b != null) b.length else -1

        val l2 = b?.length ?: -1

        //Exception and return are expressions in Kotlin
        val throwEx = b?.length ?: throw Exception("Exeption blablabla")
        val returnEx = b.length ?: return null

        return -1
    }


    fun forceNPOperator() {
        var b: String? = "AFF"

        //returns length or throw Kotlin NPE
        val length = b!!.length
    }

    fun safeCastExample() {
        var a = "12"
        val aInt: Int? = a as? Int   //If cast fails = return null   No ClassCastException
        print("aInt ${aInt}")
    }

    fun filterNullableTypesCollection() {
        val nullableList: List<Int?> = listOf(1, null, 3, 4)
        val intList: List<Int> = nullableList.filterNotNull()
        print("non-null list: ${intList}")
    }
}