package java_basics.object_orientation.basic_principles.liskov_substitution_principle;

// Car.java
public class Car extends Vehicle implements EnginePowered {

  @Override
  public void startEngine() {
    System.out.println("Car engine started");
  }
}