
public interface MyStackInterface<Type> {

  void push(Type value);

  Type pop();

  Type peek();

  boolean empty();

  int size();
}