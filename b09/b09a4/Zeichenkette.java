/**
 * @author nkuert2s
 */
public class Zeichenkette {

  /**
   * Prüft, ob s ein Palindrom ist.
   *
   * @param s zu prüfende Zeichenkette
   * @return Wahrheitswert, ob Zeichenkette ein Palindrom ist
   */
  public static boolean istPalindromLoop(String s) {
    String wort = s.toLowerCase();
    int laenge = s.length();
    for (int i = 0; i < (s.length() / 2); i++) {
      if (wort.charAt(i) != wort.charAt(laenge - (i + 1))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Prüft rekursiv, ob s ein Palindrom ist.
   *
   * @param s zu prüfende Zeichenkette
   * @return Wahrheitswert, ob Zeichenkette ein Palindrom ist
   */
  public static boolean istPalindromRek(String s) {
    return istPalindromRek(s.toLowerCase(), (s.length()), 0);
  }

  /**
   * Hilfsmethode für istPalindromRek(String s).
   *
   * @param s zu prüfende Zeichenkette
   * @param l laenger der Zeichenkette
   * @param p zu prüfende Position
   * @return Wahrheitswert, ob Zeichenkette ein Palindrom ist
   */
  private static boolean istPalindromRek(String s, int l, int p) {
    if (p >= (l / 2)) {
      return true;
    } else if (s.charAt(p) != s.charAt(l - (p + 1))) {
      return false;
    } else {
      return istPalindromRek(s, l, ++p);
    }
  }
}
