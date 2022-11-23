/**
 * @author nkuert2s
 */
public class Zeichenkette {
  public static String rueckwaerts(String s) {
    return new StringBuilder().append(s).reverse().toString();
  }

  public static String einfuegung(String s, int p, String t) {
    return s.substring(0, p) + t + s.substring(p);
  }
}
