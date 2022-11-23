/**
 * @author nkuert2s
 */
public class Mathe {
  public static String vielfache(int a, int n) {
    String res = "";
    for (int i = 1; i <= n; i++) {
      res += (i * a) + " ";
    }
    res += "\n";
    return res;
  }

  public static String einmaleins(int n) {
    String res = "";
    for (int a = 1; a <= n; a++) {
      res += vielfache(a, n);
    }
    return res;
  }
}
