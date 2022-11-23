/**
 * @author nkuert2s
 */
public class Datum {
  public static boolean istSchaltjahr(int j) {
    // return istSchaltjahr_if_else(j);
    return istSchaltjahr_logisch(j);
    // return istSchaltjahr_Mischform(j);
  }

  // (a)
  public static boolean istSchaltjahr_if_else(int j) {
    if (j < 1583) {
      return ((j % 4) == 0);
    } else {
      if (((j % 4) == 0 & (j % 100) != 0) || ((j % 4) == 0 & ((j % 100) != 0 || (j % 400) == 0))) {
        return true;
      }
    }
    return false;
  }
  
  // (b)
  public static boolean istSchaltjahr_logisch(int j) {
    return j < 1583 ? (j % 4) == 0 : (((j % 4) == 0 & (j % 100) != 0) || ((j % 4) == 0 & ((j % 100) != 0 || (j % 400) == 0)));
  }

  // (c)
  public static boolean istSchaltjahr_Mischform(int j) {
    return false;
  }
}