package java_basics.object_orientation.basic_features.inheritance;

public class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public void eat() {
    System.out.println(name + " is eating.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}