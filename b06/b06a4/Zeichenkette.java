/**
 * @author nkuert2s
 */
public class Zeichenkette {
  public static String verkuerze(String s, int n) {
    String fill = "[...]";
    int fillLen = fill.length();
    int sLen = s.length();
    return n > s.length() || 2 * n + fillLen >= sLen
        ? s
        : s.substring(0, n) + fill + s.substring(sLen - n);
  }
}
