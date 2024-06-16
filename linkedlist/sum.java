package linkedlist;

public class Sum {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int addSum() {
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    public int indexOf(int value) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtSpecific(int index, int value) {
        if (index == 0) {
            insertAtFirst(value);
            return;
        }

        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
            if (newNode.next == null) { // Update tail if newNode is inserted at the end
                tail = newNode;
            }
        }
    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sum list = new Sum();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(23);
        list.add(73);
        System.out.println("Sum of elements in list: " + list.addSum());
        System.out.println("Index of 20: " + list.indexOf(20));
        list.insertAtFirst(70);
        System.out.println("Index of 70 after insertion at first: " + list.indexOf(70));
        list.insertAtSpecific(2, 35);
        System.out.println("Index of 35 after insertion at specific index: " + list.indexOf(35));
        
        System.out.print("Original list: ");
        list.printList();
        
        list.reverse();
        
        System.out.print("Reversed list: ");
        list.printList();
    }
}
