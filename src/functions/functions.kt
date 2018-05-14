package functions

import java.math.BigDecimal

//Operator overloading
data class Money(
        val amount: BigDecimal,
        val currency: String)

operator fun Money.plus(money: Money) {
    if(currency == money.currency) {
        Money(amount + money.amount, currency)
    } else throw IllegalArgumentException("Ooops")
}

fun testOperator() {
    val money1 = Money(BigDecimal(20), "ron")
    val money2 = Money(BigDecimal(30), "ron")

    val totalPrice = money1 + money2
}

fun sum(x: Int, y: Int) = x + y


//when no "break" required
fun convertToRon(money: Money) = when (money.currency) {
    "ron" -> money
    "$" -> Money(money.amount / BigDecimal(3.9), "ron")
    "EUR" -> Money(money.amount / BigDecimal(4.7), "ron")
    else -> throw IllegalArgumentException("Not correct currency")
}


//Extension Function from Int
infix fun Int.percentOf(money: Money) = money.amount.multiply(BigDecimal(this)).divide(BigDecimal(100))

fun extensionFuncCall() {
    val chips = Money(BigDecimal(100), "ron")
    7 percentOf chips
}



