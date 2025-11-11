import java.util.Stack;

class BinTreeNodeInt {

    private int _data;
    private BinTreeNodeInt _left; // izquierda
    private BinTreeNodeInt _right; // derecha

    public BinTreeNodeInt(int value) {
        _data = value;
        _left = null;
        _right = null;
    }

    public int getData() {
        return _data;
    }

    public void setData(int data) {
        _data = data;
    }

    public BinTreeNodeInt getLeft() {
        return _left;
    }

    public void setLeft(BinTreeNodeInt left) {
        _left = left;
    }

    public BinTreeNodeInt getRight() {
        return _right;
    }

    public void setRight(BinTreeNodeInt right) {
        _right = right;
    }
}

public class BinTreeInt {

    private BinTreeNodeInt _root;

    public BinTreeInt() {
        _root = null;
    }

    public void insert(int value) {
        _root = insertRec(_root, value);
    }

    private BinTreeNodeInt insertRec(BinTreeNodeInt node, int value) {
        if (node == null) {
            return new BinTreeNodeInt(value);
        } else {
            if (value < node.getData()) {
                node.setLeft(insertRec(node.getLeft(), value));
            } else if (value > node.getData()) {
                node.setRight(insertRec(node.getRight(), value));
            }
            return node;
        }
    }

    public void inOrderTraversal() {
        System.out.print("inOrderTraversal: ");
        inOrderTraversalRec(_root);
        System.out.println();
    }

    public void preOrderTraversal() {
        System.out.print("preOrderTraversal: ");
        preOrderTraversalRec(_root);
        System.out.println();
    }

    public void postOrderTraversal() {
        System.out.print("postOrderTraversal: ");
        postOrderTraversalRec(_root);
        System.out.println();
    }

    public BinTreeNodeInt search(int value) {
        return search(_root, value);
    }

    public void inOrderTraversalIte() {
        System.out.print("inOrderTraversalIte: ");
        inOrderTraversalIte(_root);
        System.out.println();
    }

    private void inOrderTraversalIte(BinTreeNodeInt root) {
        Stack<BinTreeNodeInt> stack = new Stack<>();
        BinTreeNodeInt node = root;

        while (node != null || !stack.empty()) {
            
            while(node != null) {
                stack.push(node);
                node = node.getLeft();
            }

            node = stack.pop();
            System.out.print(node.getData() + " ");

            node = node.getRight();
        }
    }

    private BinTreeNodeInt search(BinTreeNodeInt node, int value) {
        if (node == null || node.getData() == value) {
            return node;
        } else {
            // if (value < node.getData()) {
            // return search(node.getLeft(), value);
            // } else { // value > node.getData()
            // return search(node.getRight(), value);
            // }
            return value < node.getData() ? search(node.getLeft(), value) : search(node.getRight(), value);
        }
    }

    public void delete(int value) {
        delete(_root, value);
    }

    public int getLevel(int value) {
        return getLevel(_root, value, 0);
    }

    public int getHeight() {
        return getHeight(_root);
    }

    private int getHeight(BinTreeNodeInt node) {
        if (node == null) {
            return -1;
        } else {
            int leftHeight = getHeight(node.getLeft());
            int rightHeight = getHeight(node.getRight());
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    private int getLevel(BinTreeNodeInt node, int value, int level) {
        if (node == null) {
            return -1;
        } else if (node.getData() == value) {
            return level;
        } else {
            int leftLevel = getLevel(node.getLeft(), value, level + 1);
            if (leftLevel != -1) {
                return leftLevel;
            } else {
                return getLevel(node.getRight(), value, level + 1);
            }
        }
    }

    private BinTreeNodeInt delete(BinTreeNodeInt node, int value) {
        if (node == null) {
            return node;
        } else {
            if (value < node.getData()) {
                node.setLeft(delete(node.getLeft(), value));
            } else if (value > node.getData()) {
                node.setRight(delete(node.getRight(), value));
            } else {
                if (node.getLeft() == null && node.getRight() == null) { // Leaf > hoja
                    node = null;
                } else if (node.getLeft() == null) { // One child (right)
                    node = node.getRight();
                } else if (node.getRight() == null) { // One child (left)
                    node = node.getLeft();
                } else {
                    // Two children
                    BinTreeNodeInt min = minNode(node.getRight());
                    node.setData(min.getData());
                    node.setRight(delete(node.getRight(), min.getData()));
                }
            }
            return node;
        }
    }

    private BinTreeNodeInt minNode(BinTreeNodeInt node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    private void inOrderTraversalRec(BinTreeNodeInt node) {
        if (node != null) {
            inOrderTraversalRec(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrderTraversalRec(node.getRight());
        }
    }

    private void preOrderTraversalRec(BinTreeNodeInt node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderTraversalRec(node.getLeft());
            preOrderTraversalRec(node.getRight());
        }
    }

    private void postOrderTraversalRec(BinTreeNodeInt node) {
        if (node != null) {
            postOrderTraversalRec(node.getLeft());
            postOrderTraversalRec(node.getRight());
            System.out.print(node.getData() + " ");
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
        tree.insert(8);
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
        tree.inOrderTraversalIte();
        System.out.println("search(0): " + tree.search(0));
        System.out.println("search(9): " + tree.search(9));
        System.out.println("search(5): " + tree.search(5).getData());
        System.out.println("getLevel(0): " + tree.getLevel(0));
        System.out.println("getLevel(4): " + tree.getLevel(4));
        System.out.println("getLevel(2): " + tree.getLevel(2));
        System.out.println("getLevel(5): " + tree.getLevel(5));
        System.out.println("getHeight(): " + tree.getHeight());
        tree.delete(3);
        tree.delete(2);
        tree.delete(6);
        tree.inOrderTraversal();
    }
}