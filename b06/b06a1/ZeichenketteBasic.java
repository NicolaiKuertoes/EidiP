/**
 * @author nkuert2s
 */
public class ZeichenketteBasic {
  // (a)
  public static int anzahlBuchstaben(String s) {
    int count = 0;
    for (char c : s.toUpperCase().toCharArray()) {
      if (65 <= c & c <= 90) {
        ++count;
      }
    }
    return count;
  }

  // (b)
  public static boolean istZiffernfolge(String s) {
    for (char c : s.toCharArray()) {
      if (!(48 <= c & c <= 57)) {
        return false;
      }
    }
    return true;
  }

  // (c)
  public static boolean istName(String s) {
    return !(s.startsWith("-") || s.endsWith("-") || s.contains(" "));
  }

  // (d)
  public static String vokaleGross(String s) {
    String vokaleGross = "";
    for (char c : s.toCharArray()) {
      c = Character.toLowerCase(c);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        vokaleGross += (char) (c - 32);
      } else {
        vokaleGross += c;
      }
    }
    return vokaleGross;
  }

  public static void main(String[] args) {
    System.out.println("(a)\tHallo, Welt! : " + anzahlBuchstaben("Hallo, Welt!"));
    System.out.println("(a)\t  : " + anzahlBuchstaben(""));
    System.out.println("(b)\t451 : " + istZiffernfolge("451"));
    System.out.println("\t  : " + istZiffernfolge(""));
    System.out.println("(c)\tLisa- : " + istName("Lisa-"));
    System.out.println("\tJohann Wolfgang : " + istName("Johann Wolfgang"));
    System.out.println("\tBrad-Arnold : " + istName("Brad-Arnold"));
    System.out.println("\tey : " + istName("ey"));
    System.out.println("\t  : " + istName(""));
    System.out.println("(d)\tHallo, Welt! : " + vokaleGross("Hallo, Welt!"));
    System.out.println("\tAch, Achim... : " + vokaleGross("Ach, Achim..."));
  }
}
