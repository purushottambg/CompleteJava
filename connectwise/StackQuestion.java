package connectwise;

import java.util.Scanner;
import java.util.Stack;

class MyStack {
    Stack<Integer> stack = new Stack<>();
    public MyStack() {

    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

public class StackQuestion {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(12);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}
