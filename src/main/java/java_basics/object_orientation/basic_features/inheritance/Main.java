package java_basics.object_orientation.basic_features.inheritance;

public class Main {

  public static void main(String[] args) {
    Dog dog = new Dog("Buddy");
    dog.eat();  // 继承自 Animal 类的方法
    dog.bark(); // Dog 类的方法
  }
}