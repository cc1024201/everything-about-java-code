package java_basics.collections.collection;

public class Main {

  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();

    collection.add("Apple");
    collection.add("Banana");
    collection.add("Orange");

    for (String item : collection) {
      System.out.println(item);
    }

    collection.remove("Banana");

    System.out.println("Collection size: " + collection.size());
  }
}