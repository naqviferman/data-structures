package treepack;

public class MyTree {

    class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            add(val, root);
        }
        size++;
    }

    private void add(int val, Node node) {
        if (val <= node.data) {     // go to left
            if (node.left == null) {
                node.left = new Node(val);
            } else {
                add(val, root.left);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(val);
            } else {
                add(val, root.right);
            }
        }
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node.left != null)
            printInOrder(node.left);
        System.out.println(node.data);
        if (node.right != null)
            printInOrder(node.right);
    }
}
