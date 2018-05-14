package delegation

import kotlin.properties.Delegates.notNull


//Good code
private val os: String by lazy {
    println("Computing...")
    System.getProperty("os.name") +
            " v" + System.getProperty("os.version") +
            " (" + System.getProperty("os.arch" + ")")
}







//notNullDelegation
class Person {
    var name : String by notNull()
}

fun tryNotNullDel(args: Array<String>) {
    val person = Person()
    person.name    // java.lang.IllegalStateException:
                    // Property name should be initialized before get.
    person.name = "Jack"
    print(person.name) //Jack
}









private class LateInitTest2() {
    lateinit var myVar: String

    fun setup() {
        myVar = "Hello"
    }

    fun test() {
        myVar.length
    }
}






