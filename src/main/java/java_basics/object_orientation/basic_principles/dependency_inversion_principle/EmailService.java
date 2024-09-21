package java_basics.object_orientation.basic_principles.dependency_inversion_principle;

// EmailService.java
public class EmailService implements MessageService {

  @Override
  public void sendMessage(String message) {
    System.out.println("Email message sent: " + message);
  }
}