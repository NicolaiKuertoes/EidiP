/**
 * @author nkuert2s
 */
public class GeometrieTest {
  public static boolean flaecheREckCheck(double a, double b, double erw) {
    double erg = Geometrie.flaecheREck(a, b);
    boolean istKorrekt = Mathe.equals(erg, erw);
    if (!istKorrekt) {
      // Sie koennen das Format der Ausgabe nach Geschmack aendern
      System.out.println("FEHLER: flaecheREck(" + a + "," + b + ")=="
                         + erg + " statt " + erw);
    }
    return erg == erw;
  }
  public static boolean umfangREckCheck(double a, double b, double erw) {
    double erg = Geometrie.umfangREck(a, b);
    boolean istKorrekt = Mathe.equals(erg, erw);
    if (!istKorrekt) {
      // Sie koennen das Format der Ausgabe nach Geschmack aendern
      System.out.println("FEHLER: umfangREck(" + a + "," + b + ")=="
                         + erg + " statt " + erw);
    }
    return istKorrekt;
  }
  public static boolean flaecheREckTest() {
    return flaecheREckCheck(5.0, 7.0, 35.0)
    // ergaenzen Sie weitere Testfaelle:
       /*& flaecheREckCheck(...)*/
       /*& ...                  */;
  }
  public static boolean umfangREckTest() {
    return umfangREckCheck(5.0, 7.0, 24.0)
    // ergaenzen Sie weitere Testfaelle:
       /*& umfangREckCheck(...)*/
       /*& ...                 */;
  }
  public static boolean test() {
    return flaecheREckTest()
         & umfangREckTest();
  }
}
