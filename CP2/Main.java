import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        var input = Files.readString(Path.of("input.txt"));

        Map<String, CustomQueue> map = new HashMap<>();

        var clean = input.toLowerCase()
                .replaceAll("á", "a")
                .replaceAll("é", "e")
                .replaceAll("í", "i")
                .replaceAll("ó", "o")
                .replaceAll("ú", "u")
                .replaceAll("[$%&/*--+.,:;\\/@#(){}¡!¿?«»]", "")
                .replaceAll("\\s+", " ");

        var words = clean.split(" ");
        var length = words.length;
        System.out.println("Length (words): " + length);
        for (var index = 0; index < length; index++) {
            var word = words[index];
            map.putIfAbsent(word, new CustomQueue());
            map.get(word).enqueue(index);
        }

        var graph = new CustomGraph(new char[] {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'ñ' });
        var tree = new CustomTree();
        var builder = new StringBuilder();
        for (var word : map.keySet()) {
            var size = map.get(word).getSize();
            tree.insert((double) size / (double) length, word);
            var chars = word.toCharArray();
            if (chars.length > 1) {
                for (var index = 1; index < chars.length; index++) {
                    var prev = chars[index - 1];
                    var curr = chars[index];
                    graph.addDirectedEdge(prev, curr);
                }
            }
            builder.append(word + " →" + map.get(word).getIndexes() + "\n");
        }

        Files.writeString(Path.of("clean.txt"), clean);
        Files.writeString(Path.of("map.txt"), builder.toString());
        Files.writeString(Path.of("tree.txt"), tree.getInOrderTraversal());
        Files.writeString(Path.of("matrix.csv"), graph.getMatrix());
    }
}
