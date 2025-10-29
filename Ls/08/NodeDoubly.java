public class NodeDoubly<T> {
    T data;
    NodeDoubly<T> next;
    NodeDoubly<T> prev;

    public NodeDoubly(T value) {
        data = value;
        next = null;
        prev = null;
    }
}
