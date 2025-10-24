class NodeDoubly<T> {
    T data; // valor
    NodeDoubly<T> next; // puntero/referencia al siguiente
    NodeDoubly<T> prev; // puntero/referencia al anterior

    public NodeDoubly(T value) {
        data = value;
        next = null;
        prev = null;
    }
}