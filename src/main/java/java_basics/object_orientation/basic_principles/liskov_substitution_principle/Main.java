package java_basics.object_orientation.basic_principles.liskov_substitution_principle;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Vehicle> vehicles = Arrays.asList(new Car(), new Bicycle());

    for (Vehicle vehicle : vehicles) {
      if (vehicle instanceof EnginePowered) {
        ((EnginePowered) vehicle).startEngine();
      } else {
        System.out.println("This vehicle doesn't have an engine");
      }
    }
  }
}