package linkedlistpack;

public class Driver {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addLast(3);
        myLinkedList.printList();
    }
}
