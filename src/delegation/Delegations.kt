package delegation




//Bad code
private var os1: String? = null
private val os: String
    get() {
        if (os1 == null) {
            println("Computing...")
            os1 = System.getProperty("os.name") +
                    " v" + System.getProperty("os.version") +
                    " (" + System.getProperty("os.arch" + ")")
        }
        return os1!!
    }


//Map delegation
class UserResponse(val map: Map<String, Any?>) {
    val user: User by map
}

class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

fun tryDelegation(args: Array<String>) {
    val user = mapOf(
            "name" to "Jack",
            "age" to 40
    )
    val response = mapOf(
            "user" to User(user)
    )

    val userResponse = UserResponse(response)
    println(userResponse.user.name) // Jack
    println(userResponse.user.age)  // 40
}



//private class LateInitTest() {
//    var myVar : String //Must be
//            // initialized or abstract
//
//    fun setup() {
//        myVar = "Hello"
//    }
//    fun test() {
//        myVar.length
//    }
//}