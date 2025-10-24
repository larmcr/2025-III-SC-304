public interface ListInterface<T> {

  void addFirst(T value);

  void addLast(T value);

  T removeFirst();

  T removeLast();

  T getFirst();

  T getLast();

  Boolean isEmpty();

  Integer getSize();

  void printList();

  void printListInReverse();
}