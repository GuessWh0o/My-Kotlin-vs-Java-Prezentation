package functions;

import org.jetbrains.annotations.Nullable;

public class Switch {

  private static String describe(@Nullable Integer i) {
    if (i == null) return "null";

    switch (i) {
      case 1: case 2: case 3: case 4:
        return "less than FIVE";

      case 5:
        return "FIVE";

      default:
        return "Error: Unexpected number!";
    }
  }

  public static void main(String[] args) {
    System.out.println(describe(42));
  }
}
