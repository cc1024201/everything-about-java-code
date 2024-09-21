package java_basics.object_orientation.basic_features.abstraction;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " says: Bark");
  }
}