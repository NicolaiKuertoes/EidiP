/**
 * Diese Klasse bildet die wichtigsten arithmetischen Ganzzahloperationen aus
 * den
 * Grundoperationen ++, -- und - (Negation eines Wertes, nicht Differenz zweier
 * Werte) nach.
 *
 * @author nkuert2s
 */
public class Mathe {

  /**
   * Berechnet a+b.
   *
   * @param a erster Summand
   * @param b zweiter Summand
   * @return Summe von a+b
   */
  public static int addLoop(int a, int b) {
    if (b < 0) {
      return subLoop(a, -b);
    }
    int summe = a;
    while (0 < b--) {
      ++summe;
    }
    return summe;
  }

  /**
   * Berechnet a-b.
   *
   * @param a Minuend
   * @param b Subtrahend
   * @return Differenz von a-b
   */
  public static int subLoop(int a, int b) {
    if (b < 0) {
      return addLoop(a, -b);
    }
    int differenz = a;
    while (0 < b--) {
      --differenz;
    }
    return differenz;
  }

  /**
   * Berechnet a*b.
   *
   * @param a erster Faktor
   * @param b zweiter Faktor
   * @return Produkt von a*b
   */
  public static int mulLoop(int a, int b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    boolean istNegativ = ((a < 0) ^ (b < 0));
    a = (a < 0) ? -a : a;
    b = (b < 0) ? -b : b;
    int produkt = a;
    while (1 < b--) {
      produkt = addLoop(produkt, a);
    }
    return istNegativ ? -produkt : produkt;
  }

  /**
   * Berechnet a/b.
   *
   * @param a Dividend
   * @param b Divisor
   * @return Quotient von a/b
   */
  public static int divLoop(int a, int b) {
    if ((a < 0) ^ (b < 0)) {
      return -1;
    }
    int quotient = 0;
    while (a >= b) {
      a = subLoop(a, b);
      ++quotient;
    }
    return quotient;
  }

  /**
   * Berechnet a mod(b).
   *
   * @param a Dividend
   * @param b Divisor
   * @return Rest von a/b
   */
  public static int modLoop(int a, int b) {
    return (a < 0) ? subLoop(b, -a) : subLoop(a, mulLoop(divLoop(a, b), b));
  }

  /**
   * Berechnet a^b.
   *
   * @param a Basis
   * @param b Exponent
   * @return Potenzwert von a^b
   */
  public static int powLoop(int a, int b) {
    if (b == 1) {
      return a;
    }
    if (b < 0) {
      return 0;
    }
    int potenzwert = 1;
    while (0 < b--) {
      potenzwert = mulLoop(potenzwert, a);
    }
    return potenzwert;
  }
}
