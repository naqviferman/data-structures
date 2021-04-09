package linkedlistpack;

public class MyLinkedList<E>  {

    private Node<E> head;
    private int size;

    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(E data) {
        Node<E> node = new Node<E>(data);
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(E data) {

        if (head == null) {
            addFirst(data);
            return;
        }

        Node<E> node = new Node<E>(data);
        Node<E> curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public void printList() {
        Node<E> curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
