package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    // Node definition
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Insert at first
    public void insertAtFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;

        // If list was empty, tail also points to head
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // Insert at last
    public void insertAtLast(int val) {

        // 👇 This is the exact call you're asking about
        if (tail == null) {          // list is empty
            insertAtFirst(val);      // delegate to insertAtFirst
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }



    // Main to test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // First call — insertAtLast triggers insertAtFirst
        list.insertAtLast(10);
        list.display();

        // Subsequent calls — normal tail insertion
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.display();
    }
}
