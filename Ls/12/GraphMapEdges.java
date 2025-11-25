
import java.util.HashMap;
import java.util.Map;

public class GraphMapEdges {

    private Map<Character, Map<Character, Integer>> _adjacency;

    public GraphMapEdges (){
        _adjacency = new HashMap<>();
    }

    public void addVertex(char vertex) {
        _adjacency.putIfAbsent(vertex, new HashMap<>());
    }

    public void addDirectedEdge(char source, char target, int weight) {
        addEdge(source, target, weight);
    }

    private void addEdge(char source, char target, int weight) {
        addVertex(source);
        addVertex(target);
        _adjacency.get(source).put(target, weight);
    }

    public void printGraph () {
        for (var vertex : _adjacency.keySet()) {
            System.out.println(vertex);
            for (var neighbor : _adjacency.get(vertex).keySet()) {
                System.out.println("|-> " + neighbor + " (" + _adjacency.get(vertex).get(neighbor) + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        var graph = new GraphMapEdges();

        graph.addDirectedEdge('A', 'B', 10);
        graph.addDirectedEdge('A', 'C', 50);
        graph.addDirectedEdge('A', 'D', 20);
        graph.addDirectedEdge('B', 'C', 15);

        graph.printGraph();
    }
}
