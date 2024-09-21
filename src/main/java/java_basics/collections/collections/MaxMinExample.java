package java_basics.collections.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinExample {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    int max = Collections.max(list);
    int min = Collections.min(list);
    System.out.println("Max: " + max); // Max: 5
    System.out.println("Min: " + min); // Min: 1
  }
}