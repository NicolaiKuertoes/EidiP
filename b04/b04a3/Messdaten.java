/**
 * @author nkuert2s
 */

import java.util.Scanner;

public class Messdaten {
  public static double durchschnitt(Scanner sc, String g) {
    double maxVal = -Double.MAX_VALUE;
    String maxValString = "";
    double sum = 0;
    int count = 0;
    while (sc.hasNext()) {
      int y = sc.nextInt();
      int m = sc.nextInt();
      int d = sc.nextInt();
      String gg = sc.next();
      double v = sc.nextDouble();
      if (gg.equals(g)) {
        sum += v;
        ++count;
        if (v > maxVal) {
          maxVal = v;
          maxValString = "max. " + g + " (" + v + ") am " + y + "/" + m + "/" + d;
        }
      }
    }
    System.out.println(maxValString);
    return count == 0 ? 0 : sum / count;
  }
}
