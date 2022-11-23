/**
 * @author nkuert2s
 */

import java.util.Scanner;

public class Eingabe {
  public static double durchschnitt(Scanner sc) {
    double count = 0;
    double sum = 0;
    while (sc.hasNext()) {
      sum += sc.nextDouble();
      ++count;
    }
    return count == 0.0 ? count : sum / count;
  }
}
