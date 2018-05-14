package namedparams;

public class NamedParameters {

  private static void composePerson(String firstName, String lastName, int age, int shoeSize,
      double height, double weight, boolean isVegetarian) {
    // Some usefull code here.
  }

  public static void main(String[] args) {
    composePerson("Hamato", "Yoshi", 42, 39, 149.5, 72.0, true);
  }
}
