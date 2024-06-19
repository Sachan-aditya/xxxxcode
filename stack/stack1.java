package stack;

public class stack1 {
    private int[] items;
    private int top;
    private int size;

    public stack1(int size) {
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }

    public void push(int value) {
        if (top == size) {
            System.out.println("Stack is full");
            return;
        }
        this.items[this.top] = value;
        this.top++;
    }

    public String toString() {
        StringBuilder sc = new StringBuilder();
        for (int i = top - 1; i >= 0; i--) {
            sc.append(items[i]).append(" ");
        }
        return sc.toString();
    }
    public int size()
    {
        return top;
    }

    public static void main(String args[])
    {
        stack1 stack = new stack1(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
       System.out.println("THe size of stack"+stack.size());
        System.out.println(stack);
    }
}