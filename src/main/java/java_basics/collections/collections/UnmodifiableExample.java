package java_basics.collections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableExample {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
    List<String> unmodifiableList = Collections.unmodifiableList(list);
    System.out.println(unmodifiableList);
    // unmodifiableList.add("Grapes"); // This will throw UnsupportedOperationException
  }
}