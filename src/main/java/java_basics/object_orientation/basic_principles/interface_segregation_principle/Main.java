package java_basics.object_orientation.basic_principles.interface_segregation_principle;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Workable> workers = Arrays.asList(new HumanWorker(), new RobotWorker());

    for (Workable worker : workers) {
      worker.work();
    }
  }
}