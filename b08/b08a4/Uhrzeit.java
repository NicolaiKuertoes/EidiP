/**
 * @author nkuert2s
 */
public class Uhrzeit {
  /**
   * Stunde als ganze Zahl im Bereich [0;23].
   */
  private int stunde;

  /**
   * Minute als ganze Zahl im Bereich [0;59].
   */
  private int minute;

  /**
   * Represents the 12th hour of the day.
   */
  private static final int HOUR_12 = 12;

  /**
   * Gibts an, ob der 12h- oder 24h-Modus verwendet wird.
   */
  private static boolean is12h = false;

  /**
   * Wird kein Argument übergeben, stellt das erzeugte Objekt 0:00 Uhr dar.
   */
  public Uhrzeit() {
    this.stunde = 0;
    this.minute = 0;
  }

  /**
   * Wird nur ein Wert s für die Stunde übergeben, stellt das erzeugte Objekt s:00
   * Uhr dar.
   *
   * @param stunde Wert für Stunde
   */
  public Uhrzeit(int stunde) {
    this.stunde = stunde;
    this.minute = 0;
  }

  /**
   * Werden Werte für Stunde und Minute (in dieser Reihenfolge) übergeben, stellt
   * das erzeugte Objekt die entsprechende Uhrzeit dar.
   *
   * @param stunde
   * @param minute
   */
  public Uhrzeit(int stunde, int minute) {
    this.stunde = stunde;
    this.minute = minute;
  }

  /**
   * Wird eine Uhrzeit-referenz übergeben, wird das Objekt als Kopie davon
   * erzeugt.
   *
   * @param uhrzeitReferenz
   */
  public Uhrzeit(Uhrzeit uhrzeitReferenz) {
    this.stunde = uhrzeitReferenz.stunde;
    this.minute = uhrzeitReferenz.minute;
  }

  /**
   * Getter.
   *
   * @return Wert der Stunde des Uhrzeit-Objekts
   */
  public int stunde() {
    return this.stunde;
  }

  /**
   * Getter.
   *
   * @return Wert der Minute des Uhrzeit-Objekts
   */
  public int minute() {
    return this.minute;
  }

  /**
   * Vergleicht zwei Uhrzeit-Objekte miteinander und gibt als Wahrheitswert
   * zurück, ob die durch die Instanz beschriebene Uhrzeit gleich ist zu der durch
   * das Argument beschriebenen Uhrzeit.
   *
   * @param uhrzeitReferenz
   * @return Wahrheitswert
   */
  public boolean equals(Uhrzeit uhrzeitReferenz) {
    return (stunde() == uhrzeitReferenz.stunde && minute() == uhrzeitReferenz.minute);
  }

  /**
   * Nimmt eine Uhrzeit-Referenz als Argument an und gibt als Wahrheitswert
   * zurück, ob die durch die Instanz beschriebene Uhrzeit früher ist, als die
   * durch das Argument beschrieben Uhrzeit.
   *
   * @param uhrzeitReferenz
   * @return Wahrheitswert
   */
  public boolean istFrueher(Uhrzeit uhrzeitReferenz) {
    return (stunde() <= uhrzeitReferenz.stunde && minute() < uhrzeitReferenz.minute
        || stunde() < uhrzeitReferenz.stunde);
  }

  /**
   * Schaltet das Format der Darstellung um.
   */
  public static void set12h24h() {
    is12h = !is12h;
  }

  /**
   * Gibt die Uhrzeit als Zeichenkette zurück.
   *
   * @return Zeichenkette
   */
  public String toString() {
    // Format -> 13:37 / 01:37
    String format = "%02d:%02d";

    // Setze 12h-Format Suffix (a.m. / p.m.)
    String apm = stunde() >= HOUR_12 ? "p.m." : "a.m.";

    // Wandle Wert der Stunde vom 24h-Format in das 12h-Format um.
    int stunde12h = stunde() <= HOUR_12 ? stunde() : stunde() % HOUR_12;

    // Setzt Uhrzeit entsprechend dem Format zusammen und gibt diese zurück
    return (is12h ? String.format(format + " %s", stunde12h, minute(), apm)
        : String.format(format, stunde(), minute()));
  }
}
