package java_basics.collections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillExample {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
    Collections.fill(list, "Grapes");
    System.out.println(list); // [Grapes, Grapes, Grapes]
  }
}