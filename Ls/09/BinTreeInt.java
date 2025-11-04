
class BinTreeNodeInt {
    int data;
    BinTreeNodeInt left; // izquierda
    BinTreeNodeInt right; // derecha

    BinTreeNodeInt(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class BinTreeInt {

    private BinTreeNodeInt root;

    public BinTreeInt() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BinTreeNodeInt insertRec(BinTreeNodeInt node, int value) {
        if (node == null) {
            return new BinTreeNodeInt(value);
        } else {
            if (value < node.data) {
                node.left = insertRec(node.left, value);
            } else if (value > node.data) {
                node.right = insertRec(node.right, value);
            }
            return node;
        }
    }

    public void inOrderTraversal() {
        System.out.print("inOrderTraversal: ");
        inOrderTraversalRec(root);
        System.out.println();
    }

    public void preOrderTraversal() {
        System.out.print("preOrderTraversal: ");
        preOrderTraversalRec(root);
        System.out.println();
    }

    public void postOrderTraversal() {
        System.out.print("postOrderTraversal: ");
        postOrderTraversalRec(root);
        System.out.println();
    }

    private void inOrderTraversalRec(BinTreeNodeInt node) {
        if (node != null) {
            inOrderTraversalRec(node.left);
            System.out.print(node.data + " ");
            inOrderTraversalRec(node.right);
        }
    }

    private void preOrderTraversalRec(BinTreeNodeInt node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversalRec(node.left);
            preOrderTraversalRec(node.right);
        }
    }

    private void postOrderTraversalRec(BinTreeNodeInt node) {
        if (node != null) {
            postOrderTraversalRec(node.left);
            postOrderTraversalRec(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinTreeInt tree = new BinTreeInt();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
    }
}
