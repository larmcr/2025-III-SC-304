public interface MyQueueInterface<Type> {
  
  void enqueue(Type item); // encolar

  Type dequeue(); // desencolar

  Type getFront();
  
  boolean isEmpty();

  int getSize();
}
