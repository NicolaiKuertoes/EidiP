public class ZeichenketteBasic {
  public static String rueckwaerts(String s) {
    String rueckwaerts = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      rueckwaerts += s.charAt(i);
    }
    return rueckwaerts;
  }

  public static String einfuegung(String s, int p, String t) {
    return s.substring(0, p) + t + s.substring(p);
  }

  public static void main(String[] args) {
    System.out.println(rueckwaerts("Hallo, Welt!"));
    System.out.println(einfuegung("Brot", 0, "Kaese"));
  }
}
