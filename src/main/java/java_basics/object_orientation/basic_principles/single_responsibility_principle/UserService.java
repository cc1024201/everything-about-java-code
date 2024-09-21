package java_basics.object_orientation.basic_principles.single_responsibility_principle;

import java.util.List;

public class UserService {

  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void registerUser(String name, String email) {
    User user = new User(name, email);
    userRepository.addUser(user);
  }

  public List<User> getAllUsers() {
    return userRepository.getAllUsers();
  }
}