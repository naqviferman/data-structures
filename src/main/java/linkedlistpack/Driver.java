package linkedlistpack;

public class Driver {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        Integer removeLast = myLinkedList.removeLast();
        System.out.println("removeLast = " + removeLast);

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addLast(30);

        System.out.println("getSize = " + myLinkedList.getSize());
        myLinkedList.printList();
        System.out.println("------------------------");
        removeLast = myLinkedList.removeLast();
        System.out.println("removeLast = " + removeLast);
        System.out.println("getSize = " + myLinkedList.getSize());
        myLinkedList.printList();

    }
}
