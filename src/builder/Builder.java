package builder;

@SuppressWarnings("ALL")
public class Builder {
  private int servingSize; // required
  private int servings; // required

  private int calories = 0;
  private int fat = 0;
  private int sodium = 0;
  private int carbohydrate = 0;

  public Builder setServingSize(int servingSize) {
    this.servingSize = servingSize;
    return this;
  }

  public Builder setServings(int servings) {
    this.servings = servings;
    return this;
  }

  public Builder setCalories(int calories) {
    this.calories = calories;
    return this;
  }

  public Builder setFat(int fat) {
    this.fat = fat;
    return this;
  }

  public Builder setSodium(int sodium) {
    this.sodium = sodium;
    return this;
  }

  public Builder setCarbohydrate(int carbohydrate) {
    this.carbohydrate = carbohydrate;
    return this;
  }

  JNutritionFacts build() {
    return new JNutritionFacts(servingSize, servings, calories, fat, sodium, carbohydrate);
  }

  public static void main(String[] args) {
    JNutritionFacts facts = new Builder()
        .setServingSize(100)
        .setServings(2)
        .setCalories(200)
        .setCarbohydrate(80)
        .setFat(25)
        .setSodium(12)
        .build();
  }
}
