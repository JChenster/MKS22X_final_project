import java.util.LinkedList;

public class Markov{

  private String substring;
  private int frequency;
  private LinkedList<Character> suffixes;

  public Markov(String substring){
    this.substring = substring;
    frequency = 1;
    suffixes = new LinkedList<Character>();
  }

  public void add(){
    frequency++;
  }

  public void add(char c){
    suffixes.add(c);
  }

  public String toString(){
    return "(" + substring + ", " + frequency + "," + suffixes + ")";
  }

  public int getFrequency(){
    return frequency;
  }

  public LinkedList<Character> getSuffixes(){
    return suffixes;
  }

  public char random(){
    return suffixes.get((int) (Math.random() * suffixes.size()));
  }
}
