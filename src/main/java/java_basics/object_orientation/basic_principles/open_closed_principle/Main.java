package java_basics.object_orientation.basic_principles.open_closed_principle;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);

    List<Shape> shapes = Arrays.asList(circle, rectangle);
    AreaCalculator calculator = new AreaCalculator();

    double totalArea = calculator.totalArea(shapes);
    System.out.println("Total Area: " + totalArea);
  }
}