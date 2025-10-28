public class ListCircular<T> {

    private NodeSingly<T> head;
    private NodeSingly<T> tail;

    public ListCircular() {
        head = null;
        tail = null;
    }

    public void addFirst(T value) {
        NodeSingly<T> newNode = new NodeSingly<T>(value);
        if (head == null) {
            head = newNode;
            tail = head;
            newNode.next = head;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    public void addLast(T value) {
        NodeSingly<T> newNode = new NodeSingly<T>(value);
        if (tail == null) {
            head = newNode;
            tail = head;
            newNode.next = head;
        } else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
        }
    }

    public void removeLast() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                NodeSingly<T> curr = head;
                while (curr.next != tail) {
                    curr = curr.next;
                }
                curr.next = head;
                tail = curr;
            }
        }
    }

    public T getFirst() {
        T result = null;
        if (head != null) {
            result = head.data;
        }
        return result;
    }

    public T getLast() {
        T result = null;
        if (tail != null) {
            result = tail.data;
        }
        return result;
    }

    public int getSize() {
        int size = 0;
        if (head != null) {
            NodeSingly<T> curr = head; // current = nodo actual
            do {
                size++;
                curr = curr.next;
            } while (curr != head);
        }
        return size;
    }

    public void print() {
        System.out.print("head ↦ ");
        if (head == null) {
            System.out.println("(null)");
        } else {
            NodeSingly<T> curr = head;
            do {
                System.out.print(curr.data + " ↦ ");
                curr = curr.next;
            } while (curr != head);
            System.out.println("head");
        }
    }

    public static void main(String[] args) {
        var listCirInt = new ListCircular<Integer>();
        listCirInt.print();
        System.out.println("Size: " + listCirInt.getSize());
        listCirInt.addLast(11);
        listCirInt.addLast(12);
        listCirInt.addLast(13);
        listCirInt.print();
        listCirInt.addFirst(15);
        listCirInt.addFirst(17);
        listCirInt.addFirst(19);
        listCirInt.print();
        System.out.println("First: " + listCirInt.getFirst());
        System.out.println("Last: " + listCirInt.getLast());
        System.out.println("Size: " + listCirInt.getSize());
        listCirInt.removeFirst();
        listCirInt.print();
        listCirInt.removeFirst();
        listCirInt.removeFirst();
        listCirInt.print();
        listCirInt.removeLast();
        listCirInt.print();
        listCirInt.removeLast();
        listCirInt.print();
        listCirInt.removeLast();
        listCirInt.print();
    }
}
