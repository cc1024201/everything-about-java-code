package java_basics.object_orientation.basic_principles.dependency_inversion_principle;

// Notification.java
public class Notification {

  private final MessageService messageService;

  public Notification(MessageService messageService) {
    this.messageService = messageService;
  }

  public void notify(String message) {
    messageService.sendMessage(message);
  }
}