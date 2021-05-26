package linkedlistpack;

public class SinglyLinkedListInt {

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public SinglyLinkedListInt() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
        size++;
    }

    @Override
    public String toString() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        return "";
    }
}