import java.util.ArrayList;

public class MyQueueInteger implements MyQueueInterface<Integer> {

  private ArrayList<Integer> myList;
  private int max;

  public MyQueueInteger(int capacity) {
    max = capacity;
    myList = new ArrayList<Integer>();
  }

  public void enqueue(Integer num) {
    if (myList.size() == max) {
      System.out.println("\n enqueue error: Queue is full");
      print();
    } else {
      myList.add(num);
      System.out.println("\n enqueue: " + num);
      print();
    }
  }

  public Integer dequeue() {
    if (myList.isEmpty()) {
      System.out.println("\n dequeue error: Queue is empty");
      print();
      return -1;
    } else {
      // int num = myList.remove(0);
      int num = myList.removeFirst();
      System.out.println("\n dequeue: " + num);
      print();
      return num;
    }
  }

  public Integer getFront() {
    if (myList.isEmpty()) {
      System.out.println("\n getFront error: Queue is empty");
      print();
      return -1;
    } else {
      // int num = myList.get(0);
      int num = myList.getFirst();
      System.out.println("\n getFront: " + num);
      print();
      return num;
    }
  }

  public boolean isEmpty() {
    var empty = myList.isEmpty();
    System.out.println("\n isEmpty: " + empty);
    print();
    return empty;
  }

  public int getSize() {
    int size = myList.size();
    System.out.println("\n getSize: " + size);
    print();
    return size;
  }

  public void print() {
    System.out.print("   ↳ Queue: ");
    System.out.println(myList);
  }

  public static void main(String[] args) {
    MyQueueInterface<Integer> myQueue = new MyQueueInteger(5);
    myQueue.getSize();
    myQueue.isEmpty();
    myQueue.getFront();
    myQueue.dequeue();
    myQueue.enqueue(11);
    myQueue.enqueue(12);
    myQueue.enqueue(13);
    myQueue.enqueue(14);
    myQueue.enqueue(15);
    myQueue.enqueue(16);
    myQueue.getSize();
    myQueue.isEmpty();
    myQueue.getFront();
    myQueue.dequeue();
    myQueue.getSize();
  }
}
