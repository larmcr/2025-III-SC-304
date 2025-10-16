public interface TheStackInterface<Type> {

    Boolean push(Type item);

    Type pop();

    Type peek();

    Boolean empty();

    Integer size();

    String print();
}