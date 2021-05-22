public class RandomWalker{

  public static void main(String [] args){
    int n = Integer.parseInt(args[0]);
    int x = 0;
    int y = 0;
    for (int i = 0; i<n; i++){
      int rand = (int) (Math.random() * 4);
      if (rand == 0) x++;
      else if (rand == 1) x--;
      else if (rand == 2) y++;
      else y--;
      System.out.println("(" + x + "," + y + ")");
    }
    System.out.println("squared distance = " + (x * x + y * y));
  }
}
