package linkedlistpack;

public class Driver {

    public static void main(String[] args) {

        ListI linkedList = new SinglyLinkedListInt();

//        linkedList.addFirst(10);
        linkedList.addFirst(20);
        System.out.println(linkedList);
        System.out.println(linkedList.contains(20));
        System.out.println(linkedList.contains(30));

    }
}
