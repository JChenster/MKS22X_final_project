public class Cycle{

  public static void main(String [] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int m = Integer.parseInt(args[3]);

    // Phase 1
    int slow = c;
    int fast = c;
    slow = (a * slow + b) % m;
    fast = (a * fast + b) % m;
    fast = (a * fast + b) % m;
    while (slow != fast){
      slow = (a * slow + b) % m;
      fast = (a * fast + b) % m;
      fast = (a * fast + b) % m;
    }

    // Phase 2
    int val = slow;
    int counter = 1;
    slow = (a * slow + b) % m;
    fast = (a * fast + b) % m;
    fast = (a * fast + b) % m;
    while (slow != val || fast != val){
      slow = (a * slow + b) % m;
      fast = (a * fast + b) % m;
      fast = (a * fast + b) % m;
      counter++;
    }
    System.out.println("Cycle length is " + counter + ".");
  }
}
