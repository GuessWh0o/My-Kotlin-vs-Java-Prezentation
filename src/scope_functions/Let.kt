package scope_functions

import com.sun.xml.internal.ws.addressing.EndpointReferenceUtil.transform
import java.io.File

fun letOperatorOnList() {
    val list: List<String?> = listOf("A", "B", null, "D")
    for (item in list) {
        item?.let { print(it) }  //prints all non-null values from the list
    }
}

//Let on File class
fun letOnFileClass() {
    File("a.txt").let {
        // the file is now in the variable "it"
        it.absolutePath
        it.canonicalFile
    }
}

//a. Idiomatic replacement for if (object != null) blocks
fun letReplaceNoNull() {
    val text: String? = "das"
    val len = text?.let {
        println("get length of $it")
        it.length
    } ?: 0
    println("Length of $text is $len")
}

//c. Confine scope of variable/computation
fun letScoping() {
    val transform = "stringConfinedToLetScope".let {
        println("variable can be accessed in let: $it")
        "${it.length}$it"
    }
    //cannot access original string from here
    println(transform)
}
