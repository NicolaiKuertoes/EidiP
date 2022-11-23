/**
 * @author nkuert2s
 */

import java.util.Scanner;

public class Eingabe {
  public static int zaehlen(Scanner sc, String s) {
    int count = 0;
    while (sc.hasNext()) {
      String word = sc.next();
      if (word.equals(s)) {
        ++count;
      }
    }
    return count;
  }
}
