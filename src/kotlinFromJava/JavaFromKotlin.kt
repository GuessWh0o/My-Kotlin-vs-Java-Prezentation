package kotlinFromJava
import kotlinFromJava.JavaCustomer
import java.util.ArrayList
import kotlin.test.assertEquals

class JavaFromKotlin {

    fun callJavaCustomer() {
        val customer = JavaCustomer()
        customer.firstName = "John"
        customer.lastName = "Doe"

       assertEquals( customer.firstName, "John", "NotEqual")
       assertEquals( customer.lastName, "Doe", "NotEqual")
    }


    fun javaListKotlinItterate(javaList: List<Int>) {
        val list = ArrayList<Int>()
        for(item in javaList) {
            list.add(item)
        }
        for(i in 0..javaList.size -1) {
            list[i] = javaList[i]
        }
    }

}