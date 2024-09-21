package java_basics.collections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange"));
    Collections.sort(list);
    System.out.println(list); // [Apple, Banana, Orange]
  }
}