package kotlinFromJava

import kotlin.test.assertEquals

class KotlinArrayPassedToJava {

    fun passArray() {
        val myJavArray = MyJavaArray()

        val ourArray = intArrayOf(1, 2, 3)
        assertEquals(myJavArray.sumValues(ourArray), 6)
    }
}