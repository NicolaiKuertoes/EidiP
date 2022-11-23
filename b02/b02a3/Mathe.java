/**
 * @author nkuert2s
 */
public class Mathe {
  public static int fakLoop(int n) {
    int fak = 1;
    if (n == 0) return fak;
    for (int i = 2; i <= n; ++i) {
      fak *= i;
    }
    return fak;
  }

  public static int fakRek(int n) {
    return n == 0 ? 1 : fakRek(n - 1) * n;
  }

  public static int fak(int n) {
    return fakRek(n);
  }

  public static void quadrateAusgabeRueck(int n) {
    for (int i = n; i >= 1; --i) {
      System.out.println(i * i);
    }
  }
}
