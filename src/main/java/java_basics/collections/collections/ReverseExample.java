package java_basics.collections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseExample {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
    Collections.reverse(list);
    System.out.println(list); // [Orange, Banana, Apple]
  }
}