import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class RedundancyDetector{

  public static String findLongestRepeating(String str){
    String temp = "";
    for (int i = 0; i<str.length(); i++){
      if (Character.isWhitespace(str.charAt(i))){
        temp += " ";
      }
      else{
        temp += str.charAt(i);
      }
    }
    str = temp;

    int n = str.length() / 2;
    for (int i = n; i>0; i--){
      for (int j = 0; j< str.length() - i; j++){
        String right = str.substring(j+i, str.length());
        String sub = str.substring(j, j+i);
        if (right.contains(sub)){
          return sub;
        }
      }
      n--;
    }
    return "";
  }

  public static void main (String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Type \"i\" to import text from a file or \"m\" to manually enter text.");
    String str = "";
    while(true){
      String input = s.nextLine();
      if (input.equals("i")){
        try{
          System.out.print("Enter file name: ");
          String name = s.nextLine();
          BufferedReader rd = new BufferedReader(new FileReader(name));
          while (true){
            String line = rd.readLine();
            if (line == null) break;
            str += line;
          }
          break;
        }
        catch(Exception ex){
          System.out.println(ex.toString());
        }
      }
      if (input.equals("m")){
        System.out.print("Input string: ");
        str = s.nextLine();
        break;
      }
      System.out.println("Type \"i\" to import text from a file or \"m\" to manually enter text");
    }
    s.close();

    Stopwatch st = new Stopwatch();
    String ans = findLongestRepeating(str);
    double t = st.elapsedTime();
    System.out.println(ans.length());
    System.out.println(ans + "\n");
    System.out.println("Elapsed time: " + t);
  }
}

/*
Analysis:
Note: Sample inputs were not given so running time in seconds is not provided.

The asymptotic running time and memory consumption is O((NL)^2).

Work:
f(N) = First for loop * Second for loop * .contains() (Assumes worst case scenario)
     = (.5N - L) * .5N * L^2
     <= .5N * .5N * L^2 for N >= 2 and N > L
     <= .25N^2 * L^2
     <= .25(NL)^2
     <= (NL)^2
*/
