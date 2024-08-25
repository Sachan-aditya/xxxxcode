import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        // Move all elements from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        // Push the new element onto stack2
        stack2.push(x);

        // Move all elements back from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    public int peek() {
        if (empty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack2.isEmpty();
    }

    // Optional: Getters and Setters for stack1 and stack2 if needed
    public Stack<Integer> getStack1() {
        return stack1;
    }

    public void setStack1(Stack<Integer> stack1) {
        this.stack1 = stack1;
    }

    public Stack<Integer> getStack2() {
        return stack2;
    }

    public void setStack2(Stack<Integer> stack2) {
        this.stack2 = stack2;
    }
}
