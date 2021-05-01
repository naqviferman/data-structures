package treepack;

public class Driver {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        System.out.println(tree.getSize());
        tree.add(10);
        tree.add(5);
        tree.add(20);
        tree.add(7);
        System.out.println(tree.getSize());
        System.out.println("----------------");
        tree.printInOrder();
    }
}
