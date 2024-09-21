package java_basics.object_orientation.basic_features.polymorphism;

public class Dog extends Animal {

  @Override
  public void makeSound() {
    System.out.println("Bark");
  }
}