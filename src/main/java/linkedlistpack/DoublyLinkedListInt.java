package linkedlistpack;

public class DoublyLinkedListInt implements ListI {

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedListInt() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if (tail == null) {
            addFirst(data);
            return;
        }
        tail.next = node;
        node.prev = tail;
        node = tail;
        size++;
    }

    @Override
    public void removeFirst() {
        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    @Override
    public void removeLast() {
        if (head == null || head == tail) {
            removeFirst();
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
        size--;
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
