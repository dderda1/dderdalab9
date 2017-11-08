package edu.luc.cs271.wordcount;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    HashMap<String, Integer> hashMap = new HashMap<>();
    int size = hashMap.size();
    ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(size);
    while (input.hasNext()){
      String next = input.next();
      int more = hashMap.getOrDefault(next, 0);
      more++; 
    }
    WordCounter words = new WordCounter(hashMap);
    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      list.add(entry);
    }
    Collections.sort(list, new DescendingByCount());
    for (int i = 0; i < 10; i++) {
      System.out.println(list.get(i).getKey() + "is" + list.get(i).getValue());
    }
    // TODO complete this main program DONE
    // 1. create a WordCounter instance
    // 2. use this to count the words in the input
    // 3. determine the size of the resulting map
    // 4. create an ArrayList of that size and
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
    // 7. print the (up to) ten most frequent words in the text

  }
}
