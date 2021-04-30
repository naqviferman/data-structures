package linkedlistpack;

public class Driver {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.addFirst(40);
        System.out.println("getSize = " + myLinkedList.getSize());
        myLinkedList.printList();

        boolean removeFlag = myLinkedList.remove(40);
        System.out.println("removeFlag = " + removeFlag);
        System.out.println("getSize = " + myLinkedList.getSize());
        myLinkedList.printList();
        System.out.println("------------------------");

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addLast(30);

        System.out.println("getSize = " + myLinkedList.getSize());
        myLinkedList.printList();
        System.out.println("------------------------");
        removeFlag = myLinkedList.remove(20);
        System.out.println("removeFlag = " + removeFlag);
        System.out.println("getSize = " + myLinkedList.getSize());
        myLinkedList.printList();

    }
}
