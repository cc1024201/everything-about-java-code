package java_basics.object_orientation.basic_features.inheritance;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  public void bark() {
    System.out.println(getName() + " is barking.");
  }
}