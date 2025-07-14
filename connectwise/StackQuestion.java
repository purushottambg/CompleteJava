package connectwise;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
    }

    public void push(int x) {
        while (!q1.isEmpty()){
            q2.add(q1.peek());
        }
        q1.add(x);
        while (!q2.isEmpty()){
            q1.add(q2.peek());
        }
    }

    public int pop() {
       return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
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
