/**
 * @author nkuert2s
 */
public class Mathe {

  /**
   * Berechnet a+b rekursiv.
   *
   * @param a erster Summand
   * @param b zweiter Summand
   * @return Summe von a+b
   */
  public static int addRek(int a, int b) {
    if (b < 0) {
      return subRek(a, -b);
    } else {
      return addRek(a, b, 0);
    }
  }

  /**
   * Hilfsmethode für addRek(int a, int b).
   *
   * @param a erster Summand
   * @param b zweiter Summand
   * @param c useless
   * @return Summe von a+b
   */
  private static int addRek(int a, int b, int c) {
    return b == 0 ? a : addRek(++a, --b);
  }

  /**
   * Berechnet a-b rekursiv.
   *
   * @param a Minuend
   * @param b Subtrahend
   * @return Differenz von a-b
   */
  public static int subRek(int a, int b) {
    if (b < 0) {
      return addRek(a, -b);
    } else {
      return subRek(a, b, 0);
    }
  }

  /**
   * Hilfsmethode für subRek(int a, int b).
   *
   * @param a Minuend
   * @param b Subtrahend
   * @param c useless
   * @return Differenz von a-b
   */
  private static int subRek(int a, int b, int c) {
    return b == 0 ? a : subRek(--a, --b);
  }

  /**
   * Berechnet a*b rekursiv.
   *
   * @param a erster Faktor
   * @param b zweiter Faktor
   * @return Produkt von a*b
   */
  public static int mulRek(int a, int b) {
    if ((a == 0) || (b == 0)) {
      return 0;
    } else if (b < 0) {
      return -mulRek(a, -b, 0);
    } else {
      return mulRek(a, b, 0);
    }
  }

  /**
   * Hilfsmethode für mulRek(int a, int b).
   *
   * @param a erster Faktor
   * @param b zweiter Faktor
   * @param c useless
   * @return Produkt von a*b
   */
  private static int mulRek(int a, int b, int c) {
    return a < b ? mulRek(b, a) : b != 0 ? addRek(a, mulRek(a, --b)) : 0;
  }

  /**
   * Berechnet a/b rekursiv.
   *
   * @param a Dividend
   * @param b Divisor
   * @return Quotient von a/b
   */
  public static int divRek(int a, int b) {
    if ((a < 0) && (b < 0)) {
      // div(-a, -b)
      return divRek(-a, -b, 0);
    } else if ((a < 0) && (b > 0)) {
      // div(-a, b)
      return -divRek(-a, b, 0);
    } else if ((a > 0) && (b < 0)) {
      // div(a, -b)
      return -divRek(a, -b);
    } else {
      // div(a, b)
      return divRek(a, b, 0);
    }
  }

  /**
   * Hilfsmethode für divRek(int a, int b).
   *
   * @param a Dividend
   * @param b Divisor
   * @param c useless
   * @return Quotient von a/b
   */
  private static int divRek(int a, int b, int c) {
    return (a < b) ? 0 : addRek(1, divRek(subRek(a, b), b));
  }

  /**
   * Berechnet a mod(b) rekursiv.
   *
   * @param a Dividend
   * @param b Divisor
   * @return Rest von a/b
   */
  public static int modRek(int a, int b) {
    if ((a < 0) && (b > 0)) {
      return -modRek(-a, b);
    } else if ((a > 0) && (b < 0)) {
      return modRek(a, -b);
    } else if ((a < 0) && (b < 0)) {
      return -modRek(-a, -b);
    } else {
      return modRek(a, b, 0);
    }
  }

  /**
   * Hilfsmethode für modRek(int a, int b).
   *
   * @param a Dividend
   * @param b Divisor
   * @param c useless
   * @return Rest von a/b
   */
  private static int modRek(int a, int b, int c) {
    return (b == a) ? 0 : (b < a) ? modRek(subRek(a, b), b) : a;
  }

  /**
   * Berechnet a^b rekursiv.
   *
   * @param a Basis
   * @param b Exponent
   * @return Potenzwert von a^b
   */
  public static int powRek(int a, int b) {
    return b < 0 ? 0 : powRek(a, b, 0);
  }

  /**
   * Hilfsmethode für powRek(int a, int b).
   *
   * @param a Basis
   * @param b Exponent
   * @param c useless
   * @return Potenzwert von a^b
   */
  private static int powRek(int a, int b, int c) {
    return b == 0 ? 1 : mulRek(a, powRek(a, --b));
  }
}
