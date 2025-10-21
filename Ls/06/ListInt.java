import org.w3c.dom.Node;

class NodeInt {
    int value;
    NodeInt next; // Referencia (puntero) al siguiente nodo

    public NodeInt(int val) {
        value = val;
        next = null;
    }
}

public class ListInt {
    NodeInt head;

    public ListInt() {
        head = null;
    }

    public void addFirst(int value) {
        NodeInt newNode = new NodeInt(value);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int value) {
        NodeInt newNode = new NodeInt(value);
        if (head == null) {
            head = newNode;
        } else {
            NodeInt current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head != null) {
            NodeInt prev = head; // previous: anterior
            NodeInt curr = head.next; // current: actual
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
    }

    public void print() {
        NodeInt curr = head;
        System.out.print("head ↦ ");
        while (curr != null) {
            System.out.print(curr.value + " ↦ ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListInt list = new ListInt();
        list.print();
        list.addLast(11);
        list.addLast(13);
        list.addLast(15);
        list.print();
        list.addFirst(9);
        list.print();
        list.addLast(17);
        list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
    }
}