public class ListDoubly<T> implements ListInterface<T> {

    private NodeDoubly<T> head;
    private NodeDoubly<T> tail;

    public ListDoubly() {
        head = null;
        tail = null;
    }

    public void addFirst(T value) {
        NodeDoubly<T> newNode = new NodeDoubly<T>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(T value) {
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

    public T removeFirst() {
        T data = null;
        if (head != null) {
            data = head.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
        return data;
    }

    public T removeLast() {
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

    public T getFirst() {
        T first = head != null ? head.data : null;
        return first;
    }

    public T getLast() {
        T last = tail != null ? tail.data : null;
        return last;
    }

    public Boolean isEmpty() {
        return getSize() == 0;
    }

    public Integer getSize() {
        int size = 0;
        if (head != null) {
            NodeDoubly<T> curr = head;
            do {
                size++;
                curr = curr.next;
            } while (curr != null);
        }
        return size;
    }

    public void printList() {
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

    public void printListInReverse() {
        System.out.print("tail ↦ ");
        if (tail == null) {
            System.out.println("(null)");
        } else {
            NodeDoubly<T> curr = tail;
            do {
                System.out.print(curr.data + " ↦ ");
                curr = curr.prev;
            } while (curr != null);
            System.out.println("(null)");
        }
    }

    public static void main(String[] args) {
        var listDoubly = new ListDoubly<Integer>();
        listDoubly.printList();
        listDoubly.printListInReverse();
        System.out.println("Empty: " + listDoubly.isEmpty());
        System.out.println("Size: " + listDoubly.getSize());
        System.out.println("First: " + listDoubly.getFirst());
        System.out.println("Last: " + listDoubly.getLast());
        System.out.println();
        listDoubly.addFirst(13);
        listDoubly.addFirst(12);
        listDoubly.addFirst(11);
        listDoubly.addLast(14);
        listDoubly.addLast(15);
        listDoubly.addLast(16);
        listDoubly.printList();
        listDoubly.printListInReverse();
        System.out.println("Empty: " + listDoubly.isEmpty());
        System.out.println("Size: " + listDoubly.getSize());
        System.out.println("First: " + listDoubly.getFirst());
        System.out.println("Last: " + listDoubly.getLast());
        System.out.println();
        System.out.println("Remove First: " + listDoubly.removeFirst());
        System.out.println("Remove Last: " + listDoubly.removeLast());
        listDoubly.printList();
        listDoubly.printListInReverse();
        System.out.println("Empty: " + listDoubly.isEmpty());
        System.out.println("Size: " + listDoubly.getSize());
        System.out.println("First: " + listDoubly.getFirst());
        System.out.println("Last: " + listDoubly.getLast());
    }
}
