package Stack;

import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public ImplementQueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    public int pop() {
        if(!s1.empty()){
            return s1.pop();
        }
        return -1;
    }

    public int peek() {
        if(!s1.empty()){
            return s1.peek();
        }
        return -1;
    }

    public boolean empty() {
        return s1.empty();
    }
}
