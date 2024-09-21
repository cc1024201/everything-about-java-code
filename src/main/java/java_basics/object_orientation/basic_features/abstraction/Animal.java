package java_basics.object_orientation.basic_features.abstraction;

public abstract class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // 抽象方法，没有实现
  public abstract void makeSound();
}