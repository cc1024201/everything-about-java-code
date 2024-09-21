package java_basics.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedExample {

  public static void main(String[] args) throws InterruptedException {
    List<String> list = Collections.synchronizedList(new ArrayList<>());

    // 创建多个线程来同时访问和修改列表
    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        list.add("Thread1-" + i);
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        list.add("Thread2-" + i);
      }
    });

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    // 使用同步块来遍历列表
    synchronized (list) {
      for (String item : list) {
        System.out.println(item);
      }
    }

    System.out.println("List size: " + list.size());

    /*
    Collections.synchronizedList 确保了对列表的并发访问是线程安全的。两个线程同时向列表中添加元素，最终列表的大小应该是 2000。
     */
  }
}