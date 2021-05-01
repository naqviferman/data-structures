package linkedlistpack;

public class LinkedListG<E> {

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

    public LinkedListG() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(E data) {
        Node<E> node = new Node<>(data);
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(E data) {

        if (head == null) {
            addFirst(data);
            return;
        }

        Node<E> node = new Node<>(data);
        Node<E> curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
        size++;
    }

    public E removeFirst() {
        if (head == null)
            return null;

        Node<E> curr = head;
        head = head.next;
        size--;
        return curr.data;
    }

    public E removeLast() {
        if (head == null)
            return null;

        if (head.next == null) {
            return removeFirst();
        }

        Node<E> prev = null;
        Node<E> curr = head;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        size--;
        return curr.data;
    }

    /*public boolean remove(E obj) {
        if (head == null)
            return false;

        if (head.data == obj) {
            removeFirst();
            return true;
        }

        Node<E> prev = null;
        Node<E> curr = head;

        while (curr != null) {
            if (((Comparable<E>)curr.data).compareTo(obj) == 0) {
                prev.next = curr.next;
                size--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }*/

    public boolean remove(E obj) {

        Node<E> prev = null;
        Node<E> curr = head;

        while (curr != null) {
            if (((Comparable<E>)curr.data).compareTo(obj) == 0) {
                if (curr == head) {
                    removeFirst();
                    return true;
                }
                prev.next = curr.next;
                size--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public void printList() {
        Node<E> curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
