package stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}