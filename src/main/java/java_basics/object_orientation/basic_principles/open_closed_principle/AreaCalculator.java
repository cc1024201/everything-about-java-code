package java_basics.object_orientation.basic_principles.open_closed_principle;// AreaCalculator.java

import java.util.List;

public class AreaCalculator {

  public double totalArea(List<Shape> shapes) {
    double total = 0;
    for (Shape shape : shapes) {
      total += shape.area();
    }
    return total;
  }
}