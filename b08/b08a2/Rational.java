/**
 * Die Klasse Rational stellt Brüche der Form Zähler/Nenner dar. Brüche werden,
 * um sie eindeutig zu beschreiben und keine unnötig großen Werte zu verwenden,
 * in normalisierter Form Dargestellt. Brüche sind gekürzt, d.h. der größte
 * gemeinsame Teiler von Zähler und Nenner is 1.
 *
 * @author nkuert2s
 */
public class Rational {
  /**
   * Zähler sind Ganzzahlig.
   */
  private int zaehler;

  /**
   * Nenner sind positiv ganzzahlig (nicht 0).
   */
  private int nenner;

  /**
   * Wird kein Argument übergeben, stellt der Bruch den Wert 0 dar.
   */
  public Rational() {
    this.zaehler = 0;
    this.nenner = 1;
  }

  /**
   * Für eine ganze Zahl als Argument stellt der Bruch den Wert dieser Zahl dar.
   *
   * @param zahl
   */
  public Rational(int zahl) {
    this.zaehler = zahl;
    this.nenner = 1;
  }

  /**
   * Für zwei ganze Zahlen - Dividend und Divisor - als Argumente soll der Bruch
   * den Wert des Quotienten dieser Zahlen darstellen.
   *
   * Um den Bruch intern in normalisierter Form darzustellen, ist das Vorzeichen
   * von Zähler und Nenner zu wechseln, falls letzterer negativ ist. Zudem sind
   * Dividend und Divisor durch ihren größten gemeinsamen Teiler zu teilen
   * ("kürzen").
   *
   * @param dividend
   * @param divisor
   */
  public Rational(int dividend, int divisor) {
    this.zaehler = (divisor < 0 ? -dividend : dividend) / Mathe.ggT(dividend, divisor);
    this.nenner = (divisor < 0 ? -divisor : divisor) / Mathe.ggT(dividend, divisor);
  }

  /**
   * Für eine Rational-referenz als Argument werden deren Zähler und nenner
   * übernommen.
   *
   * @param rationalReferenz
   */
  public Rational(Rational rationalReferenz) {
    this.zaehler = rationalReferenz.zaehler;
    this.nenner = rationalReferenz.nenner;
  }

  /**
   * Getter.
   *
   * @return Zähler des Bruchs
   */
  public int zaehler() {
    return this.zaehler;
  }

  /**
   * Getter.
   *
   * @return Nenner des Bruchs
   */
  public int nenner() {
    return this.nenner;
  }

  /**
   * Prüft, ob zwei Brüche gleich sind.
   *
   * @param rationalReferenz
   * @return Wahrheitswert
   */
  public boolean equals(Rational rationalReferenz) {
    return (zaehler() == rationalReferenz.zaehler
        && nenner() == rationalReferenz.nenner);
  }

  /**
   * Prüft, ob der von der Instanz dargestellte Wert kleiner ist, als der von dem
   * Argument dargestellt.
   *
   * @param rationalReferenz
   * @return Wahrheitswert
   */
  public boolean istKleiner(Rational rationalReferenz) {
    return ((zaehler() * rationalReferenz.nenner) < (rationalReferenz.zaehler * nenner()));
  }

  /**
   * Gibt den Absolutbetrag der Instanz als neues rational-Objekt zurück.
   *
   * @return Absolutbetrag
   */
  public Rational abs() {
    return new Rational(Math.abs(zaehler()), Math.abs(nenner()));
  }

  /**
   * Gibt den Kehrwert (Reziprokwert) der Instanz als neues Rational-Objekt
   * zurück.
   *
   * @return Kehrwert der Instanz
   */
  public Rational rez() {
    return new Rational(nenner(), zaehler());
  }

  /**
   * Implementiert die Addition zweier Brüche.
   *
   * @param rationalReferenz
   * @return Summer zweier Brüche als neues Rational-Objekt
   */
  public Rational add(Rational rationalReferenz) {
    return new Rational(zaehler() * rationalReferenz.nenner + rationalReferenz.zaehler * nenner(),
        nenner() * rationalReferenz.nenner);
  }

  /**
   * Implementiert die Subtraktion zweier Brüche.
   *
   * @param rationalReferenz
   * @return Differenz zweier Brüche als neues Rational-Objekt
   */
  public Rational sub(Rational rationalReferenz) {
    return new Rational(zaehler() * rationalReferenz.nenner - rationalReferenz.zaehler * nenner(),
        nenner() * rationalReferenz.nenner);
  }

  /**
   * Implementiert die Multiplikation zweier Brüche.
   *
   * @param rationalReferenz
   * @return Produkt zweier Brüche als neues rational-Objekt
   */
  public Rational mul(Rational rationalReferenz) {
    return new Rational(zaehler() * rationalReferenz.zaehler, nenner() * rationalReferenz.nenner);
  }

  /**
   * Implementiert die Division zweier Brüche.
   *
   * @param rationalReferenz
   * @return Quotient zweier Brüche als neues Rational-Objekt
   */
  public Rational div(Rational rationalReferenz) {
    return new Rational(zaehler() * rationalReferenz.nenner, nenner() * rationalReferenz.zaehler);
  }

  /**
   * Gibt den modellierten Bruch als Zeichenkette zurück, in der Form
   * "zaehler/nenner".
   *
   * @return Instanz als Zeichenkette
   */
  @Override
  public String toString() {
    return String.format("%d/%d", zaehler(), nenner());
  }
}
