package linkedlistpack;

public class Driver {

    public static void main(String[] args) {

        SinglyLinkedListInt linkedList = new SinglyLinkedListInt();

        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addLast(30);
        System.out.println(linkedList);
    }
}
