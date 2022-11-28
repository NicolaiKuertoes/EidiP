/**
 * Klasse zum finden von Primzahlen.
 *
 * @author nkuert2s
 */
public class Mathe {
  /**
   * Erste bekannte Primzahl.
   */
  public static final int FIRST_PRIME = 2;

  /**
   * Prüft mittels einer Schleife, ob p eine Primzahl ist.
   *
   * @param p Nichtnegative Zahl (vom Typ int)
   * @return Wahrheitswert, ob p eine Primzahl ist
   */
  public static boolean istPrimLoop(int p) {
    if (p != FIRST_PRIME && p % 2 == 0) {
      return false;
    } else {
      int sqrt = (int) Math.sqrt(p);
      int numberOfFactors = 0;
      for (int i = 1; i <= sqrt; i++) {
        if (p % i == 0) {
          if (i * i == p) {
            numberOfFactors += 1;
          } else {
            numberOfFactors += 2;
          }
        }
      }
      return numberOfFactors == 2;
    }
  }

  /**
   * Prüft mittels Rekursion, ob p eine Primzahl ist.
   *
   * @param p Nichtnegative Zahl (vom Typ int)
   * @return Wahrheitswert, ob p eine Primzahl ist
   */
  public static boolean istPrimRek(int p) {
    if (p != FIRST_PRIME && p % 2 == 0) {
      return false;
    } else {
      int n = FIRST_PRIME;
      return (p <= n) ? p == n : istPrimRek(p, n);
    }
  }

  /**
   * Hilfsmethode für istPrimRek(int p).
   *
   * @param p Nichtnegative Zahl (vom Typ int)
   * @param n Zu prüfende Zahl, ob n Teiler von p ist
   * @return Wahrheitswert, ob p eine Primzahl ist
   */
  private static boolean istPrimRek(int p, int n) {
    if (p % n == 0) {
      return false;
    }
    if (n * n > p) {
      return true;
    }
    return istPrimRek(p, ++n);
  }
}
