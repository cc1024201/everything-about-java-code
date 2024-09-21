package java_basics.object_orientation.basic_features.abstraction;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println(getName() + " says: Meow");
  }
}