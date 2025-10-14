import java.util.Arrays;

public class MyStackArray implements MyStackInterface<Integer> {

  private int[] array;
  private int top;
  private int max;

  public MyStackArray(int capacity) {
    max = capacity;
    top = -1;
    array = new int[max];
  }

  public void push(Integer num) {
    if (top == max -1) {
      System.out.println("\n push error: Stack Overflow");
      print();
    } else {
      top++;
      array[top] = num;
      System.out.println("\n push: " + num);
      print();
    }
  }

  public Integer pop() {
    if (top == -1) {
      System.out.println("\n pop error: Stack Underflow");
      print();
      return -1;
    } else {
      int num = array[top];
      top--;
      System.out.println("\n pop: " + num);
      print();
      return num;
    }
  }

  public Integer peek() {
    if (top == -1) {
      System.out.println("\n peek error: Stack Underflow");
      print();
      return -1;
    } else {
      int num = array[top];
      System.out.println("\n peek: " + num);
      print();
      return num;
    }
  }

  public boolean empty() {
    boolean isEmpty = top == -1;
    System.out.println("\n empty: " + isEmpty);
    print();
    return isEmpty;
  }

  public int size() {
    int theSize = top + 1;
    System.out.println("\n size: " + theSize);
    print();
    return theSize;
  }

  private void print() {
    System.out.print("  ↳ Stack: [");
    for (int index = 0; index <= top; index++) {
      System.out.print(index > 0 ? ", " + array[index] : array[index]);
    }
    System.out.println("]");
    System.out.println("     ↳ top: " + top + " | array: " + Arrays.toString(array));
  }

  public static void main(String[] args) {
    var myStackArray = new MyStackArray(5);
    myStackArray.size();
    myStackArray.empty();
    myStackArray.peek(); // Stack underflow
    myStackArray.pop(); // Stack underflow
    myStackArray.push(11);
    myStackArray.push(13);
    myStackArray.push(15);
    myStackArray.push(17);
    myStackArray.push(19);
    myStackArray.push(21); // Stack overflow
    myStackArray.empty();
    myStackArray.size();
    myStackArray.pop();
    myStackArray.peek();
    myStackArray.pop();
    myStackArray.push(23);
  }
}
