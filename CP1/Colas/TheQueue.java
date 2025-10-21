import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class TheQueue<Type> implements TheQueueInterface<Type> {

    private Deque<Type> _queue;

    public TheQueue() {
        _queue = new ArrayDeque<Type>();
    }

    public void enqueue(Type item) {
        _queue.add(item);
    }

    public Type dequeue() {
        return null;
    }

    public Type getFront() {
        return null;
    }

    public boolean isEmpty() {
        return _queue.isEmpty();
    }

    public int getSize() {
        return _queue.size();
    }

    public String[] getCodons() {
        var size = _queue.size();
        String[] codons = new String[size / 3];
        return codons;
    }

    public String print() {
        return _queue.toString();
    }

    public static void main(String[] args) {
        var amount = Integer.parseInt(args[0]);
        String[] nucleotides = {
                "A", // [0]
                "C", // [1]
                "G", // [2]
                "T", // [3]
        };
        TheQueueInterface<String> queue = new TheQueue<String>();
        var random = new Random();
        for (; amount > 0; amount--) {
            var index = random.nextInt(4);
            var amino = nucleotides[index];
            queue.enqueue(amino);
        }
        System.out.println("Filled {full}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());
        System.out.println("\ngetCodons() → " + Arrays.toString(queue.getCodons()));
        System.out.println("\nEnd {empty}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());
    }
}