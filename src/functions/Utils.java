package functions;


import utils.UtilsKt;

public final class Utils {
  public static int doubleInt(int param) {
    return param * 2;
  }

  public static String reverse(String src) {
    return new StringBuilder(src).reverse().toString();
  }

  private Utils() {
    throw new AssertionError("You shall not pass!");
  }


  public static void main(String[] args) {
    System.out.println(doubleInt(5));
    System.out.println(reverse("Test"));

    // Kotlin utils.
    System.out.println(UtilsKt.doubleInt(5));
    System.out.println(UtilsKt.reverse("Test"));
  }
}
