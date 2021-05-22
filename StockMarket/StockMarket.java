import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class StockMarket{

  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    ArrayList<Float> data = new ArrayList<Float>();
    System.out.println("Type \"i\" to import data from a file or \"m\" to manually enter data.");
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
            data.add(Float.parseFloat(line));
          }
          break;
        }
        catch(Exception ex){
          System.out.println(ex.toString());
        }
      }
      if (input.equals("m")){
        System.out.println("Start entering floats: ");
        try{
          while(s.hasNext()){
            data.add(s.nextFloat());
          }
        }
        catch(Exception ex){
          break;
        }
      }
      System.out.println("Type \"i\" to import data from a file or \"m\" to mannually enter data");
    }
    s.close();

    System.out.println("Data:");
    for (Float price: data){
      System.out.printf("%7.3f\n", price);
    }
    plot(data);
    pattern(data);
    invest(data);
  }

  public static void plot(ArrayList<Float> data){
    for (Float price: data){
      for (int i = 0; i<Math.floor(price); i++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void pattern(ArrayList<Float> data){
    ArrayList<Boolean> isUp = new ArrayList<Boolean>();
    for (int i = 0; i<data.size(); i++){
      String advice = "";
      if (i != 0) isUp.add(data.get(i) > data.get(i-1));
      if (i > 3){
        if (isUp.get(i-1) && !isUp.get(i-2) && !isUp.get(i-3) && !isUp.get(i-4)){
          advice = "buy";
        }
        if (!isUp.get(i-1) && isUp.get(i-2) && isUp.get(i-3) && isUp.get(i-4)){
          advice = "sell";
        }
      }
      System.out.printf("%5d%10.3f    %-4s\n", i+1, data.get(i), advice);
    }
  }

  public static void invest(ArrayList<Float> data){
    float cash = 10000;
    float shares = 0;
    ArrayList<Boolean> isUp = new ArrayList<Boolean>();
    System.out.println("period   price     cash       shares    value");
    System.out.println("-----------------------------------------------");
    for (int i = 0; i<data.size(); i++){
      if (i != 0) isUp.add(data.get(i) > data.get(i-1));
      if (i > 3){
        // Buy
        if (isUp.get(i-1) && !isUp.get(i-2) && !isUp.get(i-3) && !isUp.get(i-4)){
          shares += cash / data.get(i);
          cash = 0;
        }
        // Sell
        if (!isUp.get(i-1) && isUp.get(i-2) && isUp.get(i-3) && isUp.get(i-4)){
          cash += shares * data.get(i);
          shares = 0;
        }
      }
      System.out.printf("%5d%10.3f%11.2f%11.2f%11.2f\n", i+1, data.get(i), cash, shares, cash + shares * data.get(i));
    }
  }

}
