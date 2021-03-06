package linkedlistpack;

public interface ListI {

    int getSize();

    void addFirst(int data);

    void addLast(int data);

    void removeFirst();

    void removeLast();

    boolean contains(int data);
}
