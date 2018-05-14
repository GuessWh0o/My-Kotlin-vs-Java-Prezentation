package object_expressions


object SingletonClass {
    private var a: Int = 10
    var b: Int = 5
    fun addTwoValues() = a+b
}

//Object expression example with constructor
open class TestObject(val name: String = "DefaultName") {
    fun hello() = "Hello, $name"
    open fun bye() = "Bye, $name"
}
class ObjectExpressions {
    fun testObjExp() {
        val obj = object : TestObject("Max") {
        //    override fun hello() = "Hello User"  //Error hello is final and
                                                    //can not be overridden
            override fun bye() = "Bye $name"
        }
    }
}

//Object