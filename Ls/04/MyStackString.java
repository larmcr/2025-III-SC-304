import java.util.ArrayList;

public class MyStackString implements MyStackInterface<String>{

  private ArrayList<String> myList = new ArrayList<String>();

  public void push(String item) {
    throw new UnsupportedOperationException("Unimplemented method 'push'");
  }

  public String pop() {
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
  }

  public String peek() {
    throw new UnsupportedOperationException("Unimplemented method 'peek'");
  }

  public boolean empty() {
    throw new UnsupportedOperationException("Unimplemented method 'empty'");
  }

  public int size() {
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }
  
}
