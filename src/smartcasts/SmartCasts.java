package smartcasts;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import org.jetbrains.annotations.Nullable;

public class SmartCasts {

  private static void printLength(@Nullable Object obj) {
    if (obj == null) {
      System.out.println("null");
    } else if (obj instanceof String) {
      System.out.println(((String) obj).length());
    } else if (obj instanceof Collection) {
      System.out.println(((Collection) obj).size());
    } else if (obj instanceof Date) {
      System.out.println(((Date) obj).getTime());
    } else {
      System.out.println(obj.hashCode());
    }
  }

  public static void main(String[] args) {
    printLength(null);
    printLength("string");
    printLength(Arrays.asList(1, 2, 3));
    printLength(new Date());
  }
}
