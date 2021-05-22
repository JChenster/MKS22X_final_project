import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class FrequencyCounter{

  public static void main(String [] args){
    int k = Integer.parseInt(args[0]);
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

    String temp = "";
    for (int i = 0; i<str.length(); i++){
      char c = str.charAt(i);
      if (Character.isWhitespace(c)){
        temp += " ";
      }
      else temp += c;
    }
    str = temp;

    TreeMap<String, Markov> t = new TreeMap<String, Markov>();
    for (int i = 0; i<str.length() - k; i++){
      String cur = str.substring(i, i+k);
      if (!t.containsKey(cur)){
        t.put(cur, new Markov(cur));
      }
      else{
        t.get(cur).add();
      }
    }
    System.out.println(t.size() + " distinct keys");

    for (String key: t.keySet()){
      System.out.println(t.get(key).getFrequency() + " " + key);
    }
  }
}
