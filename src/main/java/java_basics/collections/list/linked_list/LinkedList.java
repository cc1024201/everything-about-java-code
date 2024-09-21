package java_basics.collections.list.linked_list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E>, Queue<E> {

  private static class Node<E> {

    E item;
    Node<E> next;
    Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
      this.item = element;
      this.next = next;
      this.prev = prev;
    }
  }

  private Node<E> first;
  private Node<E> last;
  private int size = 0;

  @Override
  public boolean add(E e) {
    linkLast(e);
    return true;
  }

  @Override
  public void add(int index, E element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    if (index == size) {
      linkLast(element);
    } else {
      linkBefore(element, node(index));
    }
  }

  @Override
  public E get(int index) {
    checkElementIndex(index);
    return node(index).item;
  }

  @Override
  public E set(int index, E element) {
    checkElementIndex(index);
    Node<E> x = node(index);
    E oldVal = x.item;
    x.item = element;
    return oldVal;
  }

  @Override
  public E remove(int index) {
    checkElementIndex(index);
    return unlink(node(index));
  }

  @Override
  public boolean remove(Object o) {
    if (o == null) {
      for (Node<E> x = first; x != null; x = x.next) {
        if (x.item == null) {
          unlink(x);
          return true;
        }
      }
    } else {
      for (Node<E> x = first; x != null; x = x.next) {
        if (o.equals(x.item)) {
          unlink(x);
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public int indexOf(Object o) {
    int index = 0;
    if (o == null) {
      for (Node<E> x = first; x != null; x = x.next) {
        if (x.item == null) {
          return index;
        }
        index++;
      }
    } else {
      for (Node<E> x = first; x != null; x = x.next) {
        if (o.equals(x.item)) {
          return index;
        }
        index++;
      }
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    int index = size;
    if (o == null) {
      for (Node<E> x = last; x != null; x = x.prev) {
        index--;
        if (x.item == null) {
          return index;
        }
      }
    } else {
      for (Node<E> x = last; x != null; x = x.prev) {
        index--;
        if (o.equals(x.item)) {
          return index;
        }
      }
    }
    return -1;
  }

  @Override
  public boolean contains(Object o) {
    return indexOf(o) >= 0;
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
    for (Node<E> x = first; x != null; ) {
      Node<E> next = x.next;
      x.item = null;
      x.next = null;
      x.prev = null;
      x = next;
    }
    first = last = null;
    size = 0;
  }

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      private Node<E> next = first;

      @Override
      public boolean hasNext() {
        return next != null;
      }

      @Override
      public E next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        E item = next.item;
        next = next.next;
        return item;
      }
    };
  }

  @Override
  public boolean offer(E e) {
    return add(e);
  }

  @Override
  public E poll() {
    if (isEmpty()) {
      return null;
    }
    return unlink(first);
  }

  @Override
  public E peek() {
    if (isEmpty()) {
      return null;
    }
    return first.item;
  }

  private void linkLast(E e) {
    final Node<E> l = last;
    final Node<E> newNode = new Node<>(l, e, null);
    last = newNode;
    if (l == null) {
      first = newNode;
    } else {
      l.next = newNode;
    }
    size++;
  }

  private void linkBefore(E e, Node<E> succ) {
    final Node<E> pred = succ.prev;
    final Node<E> newNode = new Node<>(pred, e, succ);
    succ.prev = newNode;
    if (pred == null) {
      first = newNode;
    } else {
      pred.next = newNode;
    }
    size++;
  }

  private E unlink(Node<E> x) {
    final E element = x.item;
    final Node<E> next = x.next;
    final Node<E> prev = x.prev;

    if (prev == null) {
      first = next;
    } else {
      prev.next = next;
      x.prev = null;
    }

    if (next == null) {
      last = prev;
    } else {
      next.prev = prev;
      x.next = null;
    }

    x.item = null;
    size--;
    return element;
  }

  private Node<E> node(int index) {
    if (index < (size >> 1)) {
      Node<E> x = first;
      for (int i = 0; i < index; i++) {
        x = x.next;
      }
      return x;
    } else {
      Node<E> x = last;
      for (int i = size - 1; i > index; i--) {
        x = x.prev;
      }
      return x;
    }
  }

  private void checkElementIndex(int index) {
    if (!isElementIndex(index)) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
  }

  private boolean isElementIndex(int index) {
    return index >= 0 && index < size;
  }
}