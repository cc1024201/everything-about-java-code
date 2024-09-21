package java_basics.object_orientation.basic_principles.single_responsibility_principle;

public class Main {

  public static void main(String[] args) {
    UserRepository userRepository = new UserRepository();
    UserService userService = new UserService(userRepository);

    userService.registerUser("Alice", "alice@example.com");
    userService.registerUser("Bob", "bob@example.com");

    for (User user : userService.getAllUsers()) {
      System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
    }
  }
}