package java_basics.object_orientation.basic_features.abstraction;

public class Main {

  public static void main(String[] args) {
    Animal myDog = new Dog("Buddy");
    Animal myCat = new Cat("Whiskers");

    myDog.makeSound(); // 输出 "Buddy says: Bark"
    myCat.makeSound(); // 输出 "Whiskers says: Meow"
  }
}