/**
 * @author nkuert2s
 */
public class Mathe {
  public static int ggTAdd(int a, int b) {
    if (a == 0)
      return b;
    while (b > 0) {
      if (b > 0 && a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }
    return a;
  }


  public static int ggTMul(int a, int b) {
    while (b > 0) {
      if (b > 0) {
        int t = a % b;
        a = b;
        b = t;
      }
    }
    return a;
  }


  public static int ggTAddOut(int a, int b) {
    if (a == 0) {
      System.out.println(String.valueOf(a) + " " + String.valueOf(b));
      return b;
    }
    int count = 0;
    while (b > 0) {
      System.out.println(String.valueOf(a) + " " + String.valueOf(b));
      if (b > 0 && a > b) {
        a -= b;
      } else {
        b -= a;
      }
      ++count;
    }
    System.out.println(String.valueOf(a) + " " + String.valueOf(b));
    return count;
  }


  public static int ggTMulOut(int a, int b) {
    int count = 0;
    while (b > 0) {
      System.out.println(String.valueOf(a) + " " + String.valueOf(b));
      if (b > 0) {
        int t = a % b;
        a = b;
        b = t;
      }
      ++count;
    }
    System.out.println(String.valueOf(a) + " " + String.valueOf(b));
    return count;
  }


  public static int ggT(int a, int b) {
    return ggTMul(Math.abs(a), Math.abs(b));
  }
}
