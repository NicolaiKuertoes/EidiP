
/**
 * @author nkuert2s
 */
import java.util.Scanner;
import java.io.PrintStream;

public class Interpreter {
  public static void verarbeiteEingabeEinzel(Scanner sc, PrintStream ps) {
    String p = sc.next();
    char c = sc.next().charAt(0);
    sc.next();
    String s = sc.next();

    switch (p) {
      case "vor" -> verarbeiteEingabeEinzelVor(sc, ps, c, s);
      case "nach" -> verarbeiteEingabeEinzelNach(sc, ps, c, s);
      default -> ps.append("Falsche Eingabe.\n");
    }
  }

  public static void verarbeiteEingabeEinzelVor(Scanner sc, PrintStream ps, char c, String s) {
    if (s.indexOf(c) == -1) {
      ps.append("");
    } else {
      ps.append(s.substring(0, s.lastIndexOf(c)) + "\n");
    }
  }

  public static void verarbeiteEingabeEinzelNach(Scanner sc, PrintStream ps, char c, String s) {
    if (s.indexOf(c) == -1) {
      ps.append(s + "\n");
    } else {
      ps.append(s.substring(s.indexOf(c) + 1) + "\n");
    }
  }

  public static void verarbeiteEingabe(Scanner sc, PrintStream ps) {
    while (sc.hasNext()) {
      verarbeiteEingabeEinzel(sc, ps);
    }
  }
}
