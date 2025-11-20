public class StackNode {

    private String _word;
    private StackNode _next;

    public StackNode(String word) {
        _word = word;
        _next = null;
    }

    public String getWord() {
        return _word;
    }

    public StackNode getNext() {
        return _next;
    }

    public void setNext(StackNode next) {
        _next = next;
    }
}
