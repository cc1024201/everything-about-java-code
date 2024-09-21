package java_basics.collections.list.array_list;

public class Main {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Apple");
    list.add("Banana");
    list.add("Orange");

    for (String item : list) {
      System.out.println(item);
    }

    list.remove("Banana");

    System.out.println("List size: " + list.size());
  }
}