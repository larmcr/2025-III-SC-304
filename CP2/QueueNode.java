public class QueueNode {

    private int _index;
    private QueueNode _next;

    public QueueNode(int index) {
        _index = index;
        _next = null;
    }

    public int getIndex() {
        return _index;
    }

    public QueueNode getNext() {
        return _next;
    }

    public void setNext(QueueNode next) {
        _next = next;
    }
}