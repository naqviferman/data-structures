package linkedlistpack;

public class Driver {

    public static void main(String[] args) {

        ListI linkedList = new DoublyLinkedListInt();

        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addLast(30);
        System.out.println(linkedList);


    }
}
