package stack;

import java.util.Stack;

public class loop {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        while(!stack.isEmpty())//empty1
        {
            int value=stack.pop();
            System.out.println(value);
        }
}
}
