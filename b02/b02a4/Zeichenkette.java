/**
 * @author nkuert2s
 */
public class Zeichenkette {
  public static String grussMitZeit(int stunde, String name) {
    // vor 12 Uhr: "Guten Morgen, Name!"
    if (stunde < 12) return "Guten Morgen, " + name + "!";
    // ab 18 Uhr: "Guten Abend, Name!"
    if (stunde >= 18) return "Guten Abend, " + name + "!";
    // sonst: "Guten Tag, Name!"
    return "Guten Tag, " + name + "!";
  }

  public static String zitronenEis(int n) {
    return "super".repeat(n) + "leckeres " + "Z".repeat(n) + "Zitroneneis";
  }
}
