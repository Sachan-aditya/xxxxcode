package linkedlist;

public class sum {
    Node head;

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
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public int addsum() {
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }
    public int indexof(int value)
    {
        int index=0;
        Node current=head;
        while(current!=null)
        {
            if(current.data==value)
            {
                return index;
            }
            index++;
            current=current.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        sum list = new sum();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(23);
        System.out.println("Sum of elements in list: " + list.addsum());
        System.out.println("INDEX OF="+ list.indexof(20));
    }
}