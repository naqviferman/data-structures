package linkedlistpack;

public class SinglyLinkedListInt implements ListI {

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

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    @Override
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
    public void removeFirst() {
        if (head == null)
            return;
        head = head.next;
        size--;
    }

    @Override
    public void removeLast() {
        if (head == null || head.next == null) {
            removeFirst();
            return;
        }

        Node curr = head;
        Node prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        size--;
    }

    @Override
    public boolean contains(int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
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
