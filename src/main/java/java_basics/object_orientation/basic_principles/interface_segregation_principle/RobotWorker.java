package java_basics.object_orientation.basic_principles.interface_segregation_principle;

// RobotWorker.java
public class RobotWorker implements Workable {

  @Override
  public void work() {
    System.out.println("Robot is working");
  }
}