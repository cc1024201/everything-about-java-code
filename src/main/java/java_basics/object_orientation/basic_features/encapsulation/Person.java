package java_basics.object_orientation.basic_features.encapsulation;

public class Person {

  // 私有属性
  private String name;
  private int age;

  // 公共的 getter 和 setter 方法
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0) { // 添加数据验证
      this.age = age;
    }
  }
}