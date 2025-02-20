package Stack;

import java.util.Stack;

public class ImplementMinStack {
    class Pair{
        int value;
        int min;
        Pair(){};
        Pair(int min,int value){
            this.min = min;
            this.value= this.value;
        }
    }
    Stack<Pair> s;
    ImplementMinStack(){
        s = new Stack<>();
    }
    public void push(int val) {
        if(!s.empty()){
            int mini = s.peek().min;
            if(mini>val){
                mini = val;
            }
            Pair p = new Pair(val,mini);
            s.push(p);
        }
        else{
            Pair p = new Pair(val,val);
            s.push(p);
        }
    }

    public void pop() {
        if(!s.empty()){
            s.pop();
        }
    }

    public int top() {
        if(!s.empty()){
            return s.peek().value;
        }
        return -1;
    }

    public int getMin() {
        if(!s.empty()){
            return s.peek().min;
        }
        return -1;
    }
}
