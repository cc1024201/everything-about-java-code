package java_basics.object_orientation.basic_features.polymorphism;

public class Main {

  public static void main(String[] args) {
    Animal myDog = new Dog();
    Animal myCat = new Cat();

    myDog.makeSound(); // 输出 "Bark"
    myCat.makeSound(); // 输出 "Meow"
  }
}