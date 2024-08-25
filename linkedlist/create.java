package linkedlist;

public class create {
    Node head; 

    public class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current= head;

        while (current != null) {
            
            System.out.print(current.data);
            if(current.next!=null)
            System.out.print("-->");
            current = current.next;
        }
    }

    public static void main(String args[]) {
        create list = new create();
        list.add(10);
        list.add(30);
        list.printList();
    }
}