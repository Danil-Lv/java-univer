package lr9.Ex5;

public class Example5 {
    public static void main(String[] args) {
        Node.createHead(7);
        Node.createTail(5);
    }
}

class Node {
    protected int value;
    protected Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    protected static void createHead(int size) {
        Node head = new Node(0, null);
        Node tail = head;
        for (int i = 1; i < size; i++) {
            tail.next = new Node(i, null);
            tail = tail.next;
        }
        System.out.println("Список создан с головы:");
        printNodeLinkedList(head);
    }

    protected static void createTail(int size) {
        Node head = null;
        for (int i = size - 1; i >= 0; i--) {
            head = new Node(i, head);
        }
        System.out.println("Список создан с хвоста:");
        printNodeLinkedList(head);
    }

    protected static void printNodeLinkedList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }
}
