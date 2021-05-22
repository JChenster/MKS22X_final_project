public class RGBtoCMYK{

  public static void main(String [] args){
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    double w = Math.max(Math.max(r/255.0, g/255.0), b/255.0);
    double c = (w - r / 255.0) / w;
    double m = (w - g / 255.0) / w;
    double y = (w - b / 255.0) / w;
    double bl = 1 - w;

    System.out.printf("%-8s = %f\n", "cyan", c);
    System.out.printf("%-8s = %f\n", "magenta", m);
    System.out.printf("%-8s = %f\n", "yellow", y);
    System.out.printf("%-8s = %f\n", "black", bl);
  }
}
