package smartcasts

import java.util.*

private fun printLength(obj: Any?) {
  if (obj == null) {
    println(null)
  } else if (obj is String) {
    println(obj.length)
  } else if (obj is Collection<*>) {
    println(obj.size)
  } else if (obj is Date) {
    println(obj.time)
  } else {
    println(obj.hashCode())
  }
}

fun main(args: Array<String>) {
  printLength(null)
  printLength("string")
  printLength(listOf(1, 2, 3))
  printLength(Date())
}