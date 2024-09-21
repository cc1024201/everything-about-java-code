package java_basics.object_orientation.basic_principles.single_responsibility_principle;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

  private List<User> users = new ArrayList<>();

  public void addUser(User user) {
    users.add(user);
  }

  public List<User> getAllUsers() {
    return new ArrayList<>(users);
  }
}