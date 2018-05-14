package switchnobreaks

private fun describe(i: Number?) =
    when (i) {
      null        -> "null"
      in 1..4, -3 -> "less than FIVE"
      5           -> "FIVE"
      is Double   -> "WOW Double"
      !in 1..100  -> {
        "not in FIRST HUNDRED"
      }
      else        -> {
        "Error: Unexpected number!"
      }
    }

// Just a list of conditions to be tested.
fun advanced(x: Int) =
    when {
      x.isOdd()  -> print("x is odd")
      x.isEven() -> print("x is even")
      else       -> print("x is funny")
    }

private fun Int.isOdd() = this % 2 != 0
private fun Int.isEven() = !this.isOdd()

fun main(args: Array<String>) {
  println(describe(42.0))
  advanced(42)
}
