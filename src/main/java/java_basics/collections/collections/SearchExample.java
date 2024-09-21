package java_basics.collections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchExample {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
    Collections.sort(list);
    int index = Collections.binarySearch(list, "Banana");
    System.out.println(index); // 1
  }
}