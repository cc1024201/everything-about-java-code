package java_basics.collections.list.linked_list;

import java_basics.collections.collection.Collection;

public interface List<E> extends Collection<E> {

  E get(int index);

  E set(int index, E element);

  void add(int index, E element);

  E remove(int index);

  int indexOf(Object o);

  int lastIndexOf(Object o);
}