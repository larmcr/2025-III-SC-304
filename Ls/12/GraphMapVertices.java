import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Stack;

public class GraphMapVertices {

    private Map<Character, List<Character>> _adjacency;

    public GraphMapVertices() {
        _adjacency = new HashMap<>();
    }

    public void addVertex(char vertex) {
        _adjacency.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addDirectedEdge(char source, char target) {
        addEdge(source, target);
    }

    public void addNotDirectedEdge(char source, char target) {
        addEdge(source, target);
        addEdge(target, source);
    }

    private void addEdge(char source, char target) {
        addVertex(source);
        addVertex(target);
        _adjacency.get(source).add(target);
    }

    private void printGraph() {
        for (var vertex : _adjacency.keySet()) {
            System.out.print(vertex + " ->");
            for (var neighbor : _adjacency.get(vertex)) {
                System.out.print(" " + neighbor);
            }
            System.out.println();
        }
    }

    public void printBfs(char start) {
        Queue<Character> queue = new ArrayDeque<>();
        Set<Character> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            var current = queue.poll();
            System.out.print(current + " ");

            for (var neighbor : _adjacency.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    public void printDfs(char start) {
        Stack<Character> stack = new Stack<>();
        Set<Character> visited = new HashSet<>();

        stack.push(start);
        visited.add(start);

        while (!stack.empty()) {
            var current = stack.pop();
            System.out.print(current + " ");

            for (var neighbor : _adjacency.get(current).reversed()) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        var graph = new GraphMapVertices();
        // graph.addDirectedEdge('A', 'B');
        // graph.addDirectedEdge('A', 'C');
        // graph.addDirectedEdge('A', 'D');
        // graph.addDirectedEdge('B', 'C');
        // graph.addNotDirectedEdge('A', 'B');
        // graph.addNotDirectedEdge('A', 'C');
        // graph.addNotDirectedEdge('A', 'D');
        // graph.addNotDirectedEdge('B', 'C');
        // graph.printGraph();

        graph.addDirectedEdge('a', 'b');
        graph.addDirectedEdge('a', 'c');
        graph.addDirectedEdge('a', 'd');
        graph.addDirectedEdge('b', 'e');
        graph.addDirectedEdge('b', 'f');
        graph.addDirectedEdge('c', 'g');
        graph.addDirectedEdge('d', 'g');
        graph.addDirectedEdge('d', 'h');
        graph.addDirectedEdge('d', 'i');
        graph.addDirectedEdge('e', 'j');
        graph.addDirectedEdge('f', 'k');
        graph.addDirectedEdge('f', 'l');
        graph.addDirectedEdge('f', 'h');
        graph.addDirectedEdge('i', 'm');
        graph.addDirectedEdge('i', 'n');
        graph.printGraph();

        System.out.print("BFS ('a'): ");
        graph.printBfs('a');

         System.out.print("DFS ('a'): ");
        graph.printDfs('a');
    }
}