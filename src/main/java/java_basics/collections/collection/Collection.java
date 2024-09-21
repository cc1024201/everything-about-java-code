package java_basics.collections.collection;

public interface Collection<E> extends Iterable<E> {

  boolean add(E e);

  boolean remove(Object o);

  boolean contains(Object o);

  int size();

  boolean isEmpty();

  void clear();
}