package java_basics.object_orientation.basic_principles.interface_segregation_principle;

// HumanWorker.java
public class HumanWorker implements Workable, Eatable {

  @Override
  public void work() {
    System.out.println("Human is working");
  }

  @Override
  public void eat() {
    System.out.println("Human is eating");
  }
}