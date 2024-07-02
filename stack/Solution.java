import java.util.Stack;

public class Solution {
    
    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        if(stack.empty())
            return stack;
        int num = stack.pop();
        stack = reverseStack(stack);
        stack = pushAtBottom(stack, num);
        return stack;
    }

    public static Stack<Integer> pushAtBottom(Stack<Integer> stack, int x) {
        if(stack.isEmpty()) {
            stack.push(x);
            return stack;
        }
        int num = stack.pop();
        stack = pushAtBottom(stack, x);
        stack.push(num);
        return stack;
    }
}