/**
 * Erzeugen, arbeiten und darstellen von Daten als Objekte.
 *
 * @author nkuert2s
 */
public class Datum {
  /**
   * Der Tag des Datums.
   */
  private int tag;

  /**
   * Der Monat des Datums.
   */
  private int monat;

  /**
   * Das Jahr des Datums.
   */
  private int jahr;

  /**
   * Stringrepräsentation für Reihenfolge der Darstellung eines Datums.
   */
  public static String format = "jmt";

  /**
   * Trennzeichen für Darstellung von Daten.
   */
  public static char separator = '-';

  /**
   * Konstruktor: Erzeugt das Default-Datum.
   */
  public Datum() {
    this.tag = 1;
    this.monat = 1;
    this.jahr = 1;
  }

  /**
   * Konstruktor: Erzeugt ein Datum mit bestimmten Jahr.
   *
   * @param jahr Das Jahr des Datums
   */
  public Datum(int jahr) {
    this.tag = 1;
    this.monat = 1;
    this.jahr = jahr;
  }

  /**
   * Konstruktor: Erzeugt ein Datum mit bestimmtem Jahr und Monat.
   *
   * @param jahr  Das Jahr des Datums
   * @param monat Der Monat des Datums
   */
  public Datum(int jahr, int monat) {
    this.tag = 1;
    this.monat = monat;
    this.jahr = jahr;
  }

  /**
   * Konstruktor: Erzeugt ein Datum mit bestimmtem Jahr, Monat und Tag.
   *
   * @param jahr  Das Jahr des Datums
   * @param monat Der Monat des Datums
   * @param tag   Der Tag der Datums.
   */
  public Datum(int jahr, int monat, int tag) {
    this.tag = tag;
    this.monat = monat;
    this.jahr = jahr;
  }

  /**
   * Konstruktor: Erzeugt eine Kopie eines Datums.
   *
   * @param datum Datum-Referenz
   */
  public Datum(Datum datum) {
    this.tag = datum.tag;
    this.monat = datum.monat;
    this.jahr = datum.jahr;
  }

  /**
   * Getter.
   *
   * @return Das Jahr des Datums
   */
  public int jahr() {
    return this.jahr;
  }

  /**
   * Getter.
   *
   * @return Der Monat des Datums
   */
  public int monat() {
    return this.monat;
  }

  /**
   * Getter.
   *
   * @return Der Tag des Datums
   */
  public int tag() {
    return this.tag;
  }

  /**
   * Vergleicht ein Datum mit einer Datum-Referenz.
   *
   * @param datum Datum-Referenz
   * @return Gibt als Wahrheitswert zurück, ob das durch die Instanz beschriebene
   *         Datum
   *         gleich ist, zu dem durch das Argument beschriebene Datum.
   */
  public boolean equals(Datum datum) {
    return (tag() == datum.tag
        && monat() == datum.monat
        && jahr() == datum.jahr);
  }

  /**
   * Prüft ein Datum gegen eine Datum-Referenz.
   *
   * @param datum Datum-Referenz
   * @return Gibt als Wahrheitswert zurück, ob das durch die Instanz beschriebene
   *         Datum ein früheres ist, als das durch das Argument beschriebene.
   */
  public boolean istFrueher(Datum datum) {
    return ((tag() < datum.tag && monat() <= datum.monat && jahr() <= datum.jahr)
        || (monat() < datum.monat && jahr() <= datum.jahr)
        || (jahr() < datum.jahr));
  }

  /**
   * Setter: Setzt die Reihenfolge für die Darstellung eines Datums.
   *
   * @param reihenfolge String repräsentation der Reihenfolge
   */
  public static void setFormatRF(String reihenfolge) {
    format = reihenfolge;
  }

  /**
   * Setter: Setzt das Trennzeichen für die Darstellung eines Datums.
   *
   * @param trennzeichen Das gewünschte Trennzeichen als Character
   */
  public static void setFormatTZ(char trennzeichen) {
    separator = trennzeichen;
  }

  /**
   * Stellt eine Datum-Instanz als String dar.
   */
  @Override
  public String toString() {
    // Jahr, immer 4-stellig (führenden Nullen)
    String j = String.format("%04d", jahr());

    // Monat, immer 2-stellig (führende Null)
    String m = String.format("%02d", monat());

    // Tag, immer 2-stellig (führende Null)
    String t = String.format("%02d", tag());

    // Trennzeichen (char -> String für String.join())
    String tz = String.valueOf(separator);

    // Setzt Datum entsprechend dem festgelegten format zusammen
    String datum = switch (format) {
      case "jmt" -> String.join(tz, j, m, t);
      case "tmj" -> String.join(tz, t, m, j);
      case "mtj" -> String.join(tz, m, t, j);
      default -> "Usage: jmt/tmj/mtj";
    };
    return datum;
  }
}
