import java.util.Arrays;

public class GraphMatrix {

    private int _n; // number of vertices (vertex)
    private int[][] _matrix; // matriz de adyacencia
    private char[] _labels; // etiquetas de nodos

    public GraphMatrix(char[] labels) {
        _n = labels.length;
        _matrix = new int[_n][_n];
        _labels = labels;
    }

    public void addDirectedEdge(char source, char target) {// agregar arco dirigido
        addEgde(source, target);
    }

    public void addNotDirectedEdge(char source, char target) {// agregar arco no dirigido
        addEgde(source, target);
        addEgde(target, source);
    }

    private void addEgde(char source, char target) {
        int src = Arrays.binarySearch(_labels, source);
        int tgt = Arrays.binarySearch(_labels, target);
        _matrix[src][tgt] = 1;
    }

    public void printGraph() {
        System.out.print(" ");
        for (int index = 0; index < _n; index++) {
            System.out.print(" | " + _labels[index]);
        }
        for (int row = 0; row < _n; row++) {
            System.out.println();
            System.out.print(_labels[row]);
            for (int col = 0; col < _n; col++) {
                System.out.print(" | " + _matrix[row][col]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] labels = { 'A', 'B', 'C', 'D' };
        GraphMatrix graph = new GraphMatrix(labels);
        // graph.addDirectedEdge('A', 'B');
        // graph.addDirectedEdge('A', 'C');
        // graph.addDirectedEdge('A', 'D');
        // graph.addDirectedEdge('B', 'C');
        graph.addNotDirectedEdge('A', 'B');
        graph.addNotDirectedEdge('A', 'C');
        graph.addNotDirectedEdge('A', 'D');
        graph.addNotDirectedEdge('B', 'C');
        graph.printGraph();
    }
}