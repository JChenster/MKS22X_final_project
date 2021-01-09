public class Trace{

  public static void main(String [] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int m = Integer.parseInt(args[3]);

    int val = c;
    for (int i = 0; i<m; i++){
      System.out.printf("%4d", val);
      val = (a * val + b) % m;
      if (i % 16 == 15){
        System.out.println("");
      }
    }
    System.out.println("");
  }
}
