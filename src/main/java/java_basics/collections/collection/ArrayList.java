package java_basics.collections.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements Collection<E> {

  private static final int DEFAULT_CAPACITY = 10;
  private Object[] elements;
  private int size = 0;

  public ArrayList() {
    elements = new Object[DEFAULT_CAPACITY];
  }

  @Override
  public boolean add(E e) {
    if (size == elements.length) {
      resize();
    }
    elements[size++] = e;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    for (int i = 0; i < size; i++) {
      if (elements[i].equals(o)) {
        int numMoved = size - i - 1;
        if (numMoved > 0) {
          System.arraycopy(elements, i + 1, elements, i, numMoved);
        }
        elements[--size] = null;
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean contains(Object o) {
    for (int i = 0; i < size; i++) {
      if (elements[i].equals(o)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public void clear() {
    for (int i = 0; i < size; i++) {
      elements[i] = null;
    }
    size = 0;
  }

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      private int cursor = 0;

      @Override
      public boolean hasNext() {
        return cursor < size;
      }

      @Override
      public E next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        return (E) elements[cursor++];
      }
    };
  }

  private void resize() {
    Object[] newElements = new Object[elements.length * 2];
    System.arraycopy(elements, 0, newElements, 0, elements.length);
    elements = newElements;
  }
}