package linkedlistpack;

public class Driver {

    public static void main(String[] args) {

        LinkedListG<Integer> linkedListG = new LinkedListG<>();

        linkedListG.addFirst(40);
        System.out.println("getSize = " + linkedListG.getSize());
        linkedListG.printList();

        boolean removeFlag = linkedListG.remove(40);
        System.out.println("removeFlag = " + removeFlag);
        System.out.println("getSize = " + linkedListG.getSize());
        linkedListG.printList();
        System.out.println("------------------------");

        linkedListG.addFirst(10);
        linkedListG.addFirst(20);
        linkedListG.addLast(30);

        System.out.println("getSize = " + linkedListG.getSize());
        linkedListG.printList();
        System.out.println("------------------------");
        removeFlag = linkedListG.remove(20);
        System.out.println("removeFlag = " + removeFlag);
        System.out.println("getSize = " + linkedListG.getSize());
        linkedListG.printList();

    }
}
