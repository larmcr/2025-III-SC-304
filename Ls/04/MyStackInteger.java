import java.util.ArrayList;

public class MyStackInteger implements MyStackIntegerInterface {

  private ArrayList<Integer> myList = new ArrayList<Integer>();

  private int CAPACITY = 5;

  public void push(int num) {
    if (myList.size() < CAPACITY) {
      System.out.println("\n push: " + num);
      myList.add(num);
    } else {
      System.out.println("\n 'push' failed: Stack overflow");
    }
    print();
  }

  public int pop() {
    if (!myList.isEmpty()) {
      int num = myList.removeLast();
      System.out.println("\n pop: " + num);
      print();
      return num;
    } else {
      System.out.println("\n 'pop' failed: Stack underflow");
      print();
      return -1;
    }

  }

  public int peek() {
    if (!myList.isEmpty()) {
      int num = myList.getLast();
      System.out.println("\n peek: " + num);
      print();
      return num;
    } else {
      System.out.println("\n 'peek' failed: Stack underflow");
      print();
      return -1;
    }
  }

  public boolean empty() {
    boolean isEmpty = myList.isEmpty();
    System.out.println("\n empty: " + isEmpty);
    print();
    return isEmpty;
  }

  public int size() {
    int count = myList.size();
    System.out.println("\n size: " + count);
    print();
    return count;
  }

  private void print() {
    System.out.print("  ↳ Stack: ");
    System.out.println(myList);
  }

  public static void main(String[] args) {
    MyStackInteger myStack = new MyStackInteger();
    myStack.push(7);
    myStack.push(5);
    myStack.push(10);

    int last = myStack.pop();
    System.out.println("\t last: " + last);

    last = myStack.peek();
    System.out.println("\t last: " + last);

    boolean isEmpty = myStack.empty();
    System.out.println("\t isEmpty: " + isEmpty);

    int length = myStack.size();
    System.out.println("\t length: " + length);

    myStack.pop();
    myStack.pop();
    myStack.pop(); // Exception: Stack underflow
    myStack.peek(); // Exception: Stack underflow

    isEmpty = myStack.empty();
    System.out.println("\t isEmpty: " + isEmpty);

    myStack.push(25);
    myStack.push(40);
    myStack.push(1);
    myStack.push(6);
    myStack.push(100);
    myStack.push(3); // Exception: Stack overflow
  }

}
