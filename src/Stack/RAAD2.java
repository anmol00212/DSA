package Stack;

import java.util.Stack;

public class RAAD2 {
    static class Pair{
        char val;
        int freq;
        Pair(char val,int freq){
            this.val = val;
            this.freq = freq;
        }
    }

    public static String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.empty() && stack.peek().val == c){
                stack.peek().freq+=1;
            }
            else{
                Pair p = new Pair(c,1);
                stack.push(p);
            }
            if(stack.peek().freq == k){
                stack.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        while(!stack.empty()){
            Pair p = stack.pop();
            while(p.freq-->0){
                str.insert(0,p.val);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s,k));
    }
}
