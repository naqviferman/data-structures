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

    public boolean contains(int val ) {
        return contains(val, root);
    }

    private boolean contains(int val, Node node) {
        if (val == node.data)
            return true;
        if (val <= node.data) {
            if (node.left == null)
                return false;
            return contains(val, node.left);
        }
        else {
            if (node.right == null)
                return false;
            return contains(val, node.right);
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

    public void printPreOrder() {
        printPreOrder(root);
    }

    private void printPreOrder(Node node) {
        if (node != null) {
            System.out.println(node.data);
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node node) {
        if (node != null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.println(node.data);
        }
    }

}
