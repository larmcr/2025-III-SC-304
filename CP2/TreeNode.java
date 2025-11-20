public class TreeNode {

    private double _tf;
    private CustomStack _words;
    private TreeNode _left;
    private TreeNode _right;

    public TreeNode(double tf) {
        _tf = tf;
        _words = new CustomStack();
        _left = null;
        _right = null;
    }

    public void addWord(String word) {
        _words.push(word);
    }

    public double getTf() {
        return _tf;
    }

    public String getWords() {
        return _words.getWords();
    }

    public TreeNode getLeft() {
        return _left;
    }

    public TreeNode getRight() {
        return _right;
    }

    public void setLeft(TreeNode left) {
        _left = left;
    }

    public void setRight(TreeNode right) {
        _right = right;
    }
}
