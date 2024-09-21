package java_basics.object_orientation.basic_features.polymorphism;

public class Cat extends Animal {

  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}