/**
 * @author nkuert2s
 */
public class Mathe {

  public static int abs(int n) {
    return n < 0 ? -n : n;
  }

  public static int max3(int a, int b, int c) {
    return a > b ? a > c ? a : c : b > c ? b : c;
  }
}
