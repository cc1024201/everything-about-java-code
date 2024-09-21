package java_basics.object_orientation.basic_principles.open_closed_principle;

// Circle.java
public class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}