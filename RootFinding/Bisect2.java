public class Bisect2{

  private static int functionCalls = 0;
  private static int i = 2;

  public static double f(double x){
    return i - Math.pow(x, 2);
  }

  public static double root(double l, double r){
    double epsilon = 0.000001;
    while (r - l > epsilon){
      double m = l + (r - l) / 2;
      if (f(m) > 0.0) l = m;
      else r = m;
      functionCalls++;
    }
    return r;
  }

  public static void main(String [] args){
    while (i < 21){
      System.out.printf("%2d%12f\n", i, root(1.0, i));
      i++;
    }
    System.out.println("Total function calls: " + functionCalls);
  }
}
