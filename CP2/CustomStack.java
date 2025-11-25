public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
        var node = new StackNode(word);

        // Actualizar

        _head = node;
    }

    public String pop() {
        String word = null;

        // Actualizar

        return word;
    }

    public int size() {
        var length = 0;

        // Actualizar

        return length;
    }

    public String getWords() {
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}