package linkedlistpack;

public class Driver {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        Integer removeFirst = myLinkedList.removeFirst();
        System.out.println("removeFirst = " + removeFirst);

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addLast(30);

        System.out.println("getSize = " + myLinkedList.getSize());
        myLinkedList.printList();
        System.out.println("------------------------");
        removeFirst = myLinkedList.removeFirst();
        System.out.println("removeFirst = " + removeFirst);
        System.out.println("getSize = " + myLinkedList.getSize());
        myLinkedList.printList();

    }
}
