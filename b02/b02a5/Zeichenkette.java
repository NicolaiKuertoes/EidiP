import java.time.chrono.MinguoChronology;

/**
 * @author nkuert2s
 */
public class Zeichenkette {
  public static String wiederhole(int n, String s, char t) {
    if (n == 0) return "";
    // when repeatedly concatenating in a loop use StringBuilder (for performance)
    StringBuilder res = new StringBuilder(s);
    for (int i = 1; i < n; i++) {
      res.append(t).append(s);
    }
    return res.toString();
  }
}
