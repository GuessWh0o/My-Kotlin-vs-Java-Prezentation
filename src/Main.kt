import kotlinFromJava.JavaCollections
import kotlinFromJava.KotlinCollections

fun main(args: Array<String>) {
    val javaFromKotlin = KotlinCollections()
    javaFromKotlin.listEx()

    val javaFIl = JavaCollections()
    javaFIl.listEx()
}