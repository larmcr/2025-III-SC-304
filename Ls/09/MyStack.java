import java.util.Random;

public class MyStack<T> implements MyStackInterface<T> {

    private NodeDoubly<T> head; // primero
    private NodeDoubly<T> tail; // ultimo

    private MyStack() {
        head = null;
        tail = null;
    }

    public void push(T value) {
        NodeDoubly<T> newNode = new NodeDoubly<T>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T pop() {
        T data = null;
        if (tail != null) {
            data = tail.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
        return data;
    }

    public T peek() {
        return tail == null ? null : tail.data;
    }

    public boolean empty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        if (head != null) {
            NodeDoubly<T> curr = head;
            do {
                count++;
                curr = curr.next;
            } while (curr != null);
        }
        return count;
    }

    public void print() {
        System.out.print("head ↦ ");
        if (head == null) {
            System.out.println("(null)");
        } else {
            NodeDoubly<T> curr = head;
            do {
                System.out.print(curr.data + " ↦ ");
                curr = curr.next;
            } while (curr != null);
            System.out.println("(null)");
        }
    }

    public static void main(String[] args) {
        var x = 3;
        var stack = new MyStack<Double>();
        System.out.println("Pushing");
        var random = new Random();
        for (var n = 0; n < x; n++) {
            var number = random.nextDouble();
            stack.push(number);
            System.out.println(" ↳ push(" + number + ")");
        }
        System.out.println();
        System.out.println("Pushed {full}");
        System.out.print(" ↳ print() → ");
        stack.print();
        System.out.println("   ↳ peek() → " + stack.peek());
        System.out.println("   ↳ size() → " + stack.size());
        System.out.println("   ↳ empty() → " + stack.empty());
        System.out.println();
        System.out.println("Popping {capacity + 1}");
        for (var n = 0; n <= x; n++) {
            var popped = stack.pop();
            System.out.println(" ↳ pop() → " + popped);
        }
        System.out.println();
        System.out.println("Popped {empty}");
        System.out.print(" ↳ print() → ");
        stack.print();
        System.out.println("   ↳ peek() → " + stack.peek());
        System.out.println("   ↳ size() → " + stack.size());
        System.out.println("   ↳ empty() → " + stack.empty());
    }

}
