package java_basics.collections.list.linked_list;

public class Main {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();

    list.add("Apple");
    list.add("Banana");
    list.add("Orange");

    for (String item : list) {
      System.out.println(item);
    }

    list.remove("Banana");

    System.out.println("List size: " + list.size());

    list.offer("Grapes");
    System.out.println("First element: " + list.peek());
    System.out.println("Polled element: " + list.poll());
  }
}