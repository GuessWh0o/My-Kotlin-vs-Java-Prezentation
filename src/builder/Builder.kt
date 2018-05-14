package builder

fun main(args: Array<String>) {
  // If our object is mutable.
  val jFacts = JNutritionFacts().apply {
    servingSize = 100
    servings = 2
    calories = 200
    fat = 80
    sodium = 25
    carbohydrate = 12
  }

  // If object is immutable.
  val kFacts = KNutritionFacts(
      servingSize = 100,
      servings = 2,
      calories = 200,
      fat = 80,
      sodium = 25,
      carbohydrate = 12
  )
}
