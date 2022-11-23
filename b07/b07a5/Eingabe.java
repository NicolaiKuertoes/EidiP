
/**
 * @author nkuert2s
 */
import java.io.PrintStream;
import java.util.Scanner;

public class Eingabe {
  public static int filter(Scanner sc, PrintStream ps, String start, String stop, String skip) {
    int count = 0;
    boolean ignore = false;
    while (sc.hasNext()) {
      String next = sc.next();
      if (next.equals(start)) {
        ignore = true;
      } else if (next.equals(stop)) {
        ignore = false;
      } else if (next.equals(skip) & !ignore) {
        sc.nextLine();
      } else if (!ignore) {
        ps.print(next + " ");
        ++count;
      }
    }
    ps.print("\n");
    return count;
  }
}
