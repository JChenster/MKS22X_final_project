public class RandomWalkers{

  public static void main(String [] args){
    int n = Integer.parseInt(args[0]);
    int t = Integer.parseInt(args[1]);
    int x, y;
    int sum = 0;
    for (int i = 0; i<t; i++){
      x = y = 0;
      for (int j = 0; j<n; j++){
        int rand = (int) (Math.random() * 4);
        if (rand == 0) x++;
        else if (rand == 1) x--;
        else if (rand == 2) y++;
        else y--;
      }
      sum += (x*x + y*y);
    }

    System.out.println("mean squared distance = " + (double) sum / t);
  }
}

/* Hypothesis: The mean squared distance has a one to one correspondence with N
   ie. mean squared distance = N;
*/
