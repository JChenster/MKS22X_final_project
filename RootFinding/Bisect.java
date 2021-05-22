public class Bisect{

  public static double f(double x){
    //return 126.0 - Math.pow(x, 7);
    //return 2.0 - Math.pow(x, 2);
    return 6 - x - Math.pow(x, 3);
  }

  public static double root (double l, double r){
    double epsilon = 0.000001;
    System.out.println("Interval: [" + l + "," + r + "]");
    while (r - l > epsilon){
      double m = l + (r - l) / 2;
      if (f(m) > 0.0) l = m;
      else r = m;
      System.out.println("Interval: [" + l + "," + r + "]");
    }
    return r;
  }

  public static void main(String [] args){
    System.out.printf("%f\n", root(1.0, 2.0));
  }
}
