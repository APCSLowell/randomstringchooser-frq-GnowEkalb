import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> words;
  public RandomStringChooser(String[] wordArray){
    words = new ArrayList <String>();
    for (int i = 0; i < wordArray.length; i++){
      words.add(wordArray[i]);
    }
  }
  public String getNext(){
    if (words.size() == 0)
      return "NONE";
    int rand = (int)(Math.random()*words.size());
    String temp = words.get(rand);
    words.remove(rand);
    return temp;
  }
}
