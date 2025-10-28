public class NodeSingly<T> {
    T data;
    NodeSingly<T> next; // Referencia (puntero) al siguiente nodo

    public NodeSingly(T value) {
        data = value;
        next = null;
    }
}