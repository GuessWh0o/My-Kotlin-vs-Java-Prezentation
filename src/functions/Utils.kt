package utils

import java.lang.StringBuilder

/**
 * @author Sergey Chistyakov <serge.chistyakov@gmail.com>
 *         21.06.2017
 */
fun doubleInt(param: Int) = param * 2

fun String.reverse() = StringBuilder(this).reverse().toString()

fun main(args: Array<String>) {
  println(doubleInt(5))

  println("Test".reverse())
}
