package namedparams

private fun composePerson(firstName: String, lastName: String, age: Int, shoeSize: Int,
                          height: Double, weight: Double, isVegetarian: Boolean) {
    // Some usefull code here.
}

fun main(args: Array<String>) {
    composePerson(
            firstName = "Hamato",
            shoeSize = 39,
            lastName = "Yoshi",
            age = 42,
            height = 149.5,
            weight = 72.0,
            isVegetarian = true    )
}
