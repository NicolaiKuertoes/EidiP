/**
 * @author nkuert2s
 */
public class Zeichenkette {
  public static int anzahlBuchstaben(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if ((s.charAt(i) >= 65 & s.charAt(i) <= 90)
          || ((s.charAt(i)) >= 97 & s.charAt(i) <= 122)
          || (Character.toString(s.charAt(i)).matches("[äÄöÖüÜ]"))) {
        ++count;
      }
    }
    return count;
  }

  public static boolean istZiffernfolge(String s) {
    return s.matches("^\\d*$");
  }

  public static boolean istName(String s) {
    return s.matches("([a-zA-Z]+(-[a-zA-Z]+)*)*");
  }

  public static String vokaleGross(String s) {
    StringBuilder vokaleGross = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = Character.toLowerCase(s.charAt(i));
      switch (c) {
        case 'a' -> vokaleGross.append('A');
        case 'e' -> vokaleGross.append('E');
        case 'i' -> vokaleGross.append('I');
        case 'o' -> vokaleGross.append('O');
        case 'u' -> vokaleGross.append('U');
        default -> vokaleGross.append(c);
      }
    }
    return vokaleGross.toString();
  }
}
