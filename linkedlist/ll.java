package linkedlist;

public class ll {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // declare head variable
    Node tail; // declare tail variable

    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addLast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            Node currnode = head;
            while (currnode.next != null) {
                currnode = currnode.next;
            }
            currnode.next = newnode;
            tail = newnode;
        }
    }

    public void printList() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "=> ");
            currnode = currnode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst("1");
        list.addFirst("2");
        list.addLast("3");
        list.printList(); // prints: World Hello work
    }
}