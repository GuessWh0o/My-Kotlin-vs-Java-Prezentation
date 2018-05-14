package scope_functions

import java.awt.Color

//Initializing Object
class Bar(var color: Color = Color.BLUE, var name: String = "No Name")
fun initBar() {
    val bar = Bar().apply {
        color = Color.RED
        name = "New Name"
    }
    print(bar)
}

//Builder-style usage with methods that return Unit
data class FooBar(var a: Int = 0, var b: String? = null) {
    fun first(aArg: Int): FooBar = apply { a = aArg }
    fun second(bArg: String): FooBar = apply { b = bArg }
}

fun builderApply() {
    val bar = FooBar().first(10).second("foobarValue")
    println(bar)
}