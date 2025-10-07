import java.util.ArrayList;

public class MyStack<Type> implements MyStackInterface<Type>{

  private ArrayList<Type> myList = new ArrayList<Type>();

  public void push(Type item) {
    throw new UnsupportedOperationException("Unimplemented method 'push'");
  }

  public Type pop() {
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
  }

  public Type peek() {
    throw new UnsupportedOperationException("Unimplemented method 'peek'");
  }

  public boolean empty() {
    throw new UnsupportedOperationException("Unimplemented method 'empty'");
  }

  public int size() {
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  public static void main(String[] args) {
    MyStack<Object> myStack = new MyStack<Object>();
  }

}
