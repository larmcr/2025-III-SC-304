import java.util.Arrays;

public class MyQueueArray implements MyQueueInterface<Integer> {

    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int max;

    public MyQueueArray(int capacity) {
        max = capacity;
        size = 0;
        rear = -1;
        front = 0;
        array = new int[max];
    }

    public void enqueue(Integer num) {
        if (size == max) {
            System.out.println("\n enqueue failed: Queue is full");
        } else {
            size++;
            rear++;
            rear = rear % max;
            array[rear] = num;
            System.out.println("\n enqueue: " + num);
        }
        print();
    }

    public Integer dequeue() {
        if (size == 0) {
            System.out.println("\n dequeue failed: Queue is empty");
            print();
            return -1;
        } else {
            int num = array[front];
            size--; // size = size - 1;
            front++; // front = front + 1;
            front = front % max;
            System.out.println("\n dequeue: " + num);
            print();
            return num;
        }
    }

    public Integer getFront() {
        if (size == 0) {
            System.out.println("\n getFront failed: Queue is empty");
            print();
            return -1;
        } else {
            int num = array[front];
            System.out.println("\n getFront: " + num);
            print();
            return num;
        }
    }

    public boolean isEmpty() {
        boolean empty = size == 0;
        System.out.println("\n isEmpty: " + empty);
        print();
        return empty;
    }

    public int getSize() {
        System.out.println("\n getSize: " + size);
        print();
        return size;
    }

    private void print() {
        System.out.print(" dequeue ↳ Queue: [");
        for (int index = 0; index < size; index++) {
            var ind = (index + front) % max;
            System.out.print(index > 0 ? ", " + array[ind] : array[ind]);
        }
        System.out.println("]");
        System.out.println(
                "     ↳ front: " + front + " | rear: " + rear + " | size: " + size + " | array: "
                        + Arrays.toString(array));
    }

    public static void main(String[] args) {
        MyQueueArray myQueueArray = new MyQueueArray(5);
        myQueueArray.getSize();
        myQueueArray.isEmpty();
        myQueueArray.getFront();
        myQueueArray.dequeue();
        myQueueArray.enqueue(11);
        myQueueArray.enqueue(13);
        myQueueArray.enqueue(15);
        myQueueArray.enqueue(17);
        myQueueArray.enqueue(19);
        myQueueArray.enqueue(21);
        myQueueArray.dequeue();
        myQueueArray.dequeue();
        myQueueArray.dequeue();
        myQueueArray.enqueue(30);
        myQueueArray.enqueue(31);
    }
}
