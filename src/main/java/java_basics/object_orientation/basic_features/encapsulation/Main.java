package java_basics.object_orientation.basic_features.encapsulation;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    person.setName("Alice");
    person.setAge(30);

    System.out.println(person.getName() + " is " + person.getAge() + " years old.");
  }
}