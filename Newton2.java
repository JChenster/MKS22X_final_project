public class Newton2{

  private static int functionCalls = 0;
  private static int c = 2;

  public static double f(double x){
    return c - Math.pow(x, 2);
  }

  public static double root(double c){
    double epsilon = 0.000001;
    double t, prevt;
    prevt = t = 0.5 * c;
    t = (c/t + t) / 2;
    functionCalls++;
    while (Math.abs(t - prevt) > epsilon){
      prevt = t;
      t = (c/t + t) / 2;
      functionCalls++;
    }
    return t;
  }

  public static void main(String [] args){
    while (c < 21){
      System.out.printf("%2d%12f\n", c, root(c));
      c++;
    }
    System.out.println("Total function calls: " + functionCalls);
  }

}
