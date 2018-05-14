package scope_functions

import java.util.*

//1) Working with an object in confined scope
/*
The StringBuilder passed to with is only acting as an intermediate instance
 that helps in creating the more relevant String that gets created in with.
 It’s obvious that with is utilized for wrapping the calls to StringBuilder
  without exposing the instance itself to the outer scope.
 */
fun scopeWith() {
    val s: String = with(StringBuilder("init")) {
        append("some").append("thing")
        println("current value: $this")
        toString()
    }
    println(s)
}


//2) Using member extensions of a class
object Foo {
    fun ClosedRange<Int>.random() =
            Random().nextInt(endInclusive - start) + start
}

fun memberExtension() {
    // random() can only be used in context of `Foo`
    with(Foo) {
        val rnd = (0..10).random()
        println(rnd)
    }
}