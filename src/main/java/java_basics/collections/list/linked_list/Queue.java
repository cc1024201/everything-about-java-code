package java_basics.collections.list.linked_list;

public interface Queue<E> {

  boolean offer(E e);

  E poll();

  E peek();
}