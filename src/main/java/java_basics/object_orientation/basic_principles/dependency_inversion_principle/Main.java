package java_basics.object_orientation.basic_principles.dependency_inversion_principle;

public class Main {

  public static void main(String[] args) {
    MessageService emailService = new EmailService();
    Notification notification = new Notification(emailService);
    notification.notify("Hello, Dependency Inversion Principle!");
  }
}