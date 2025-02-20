package Stack;

import java.util.Stack;

public class MakeStringGreat {
    public static String makeGood(String s) {
        Stack<Character> ss = new Stack<>();
        char[] a = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(!ss.empty()){
                char t = ss.peek();
                char f = a[i];
                if(f==t-32 || f==t+32){
                    ss.pop();
                }
                else{
                    ss.push(f);
                }
            }
            else{
                ss.push(a[i]);
            }
        }
        String ans = "";
        while(!ss.empty()){
            ans = ss.pop()+ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s= "abBAcC";
        System.out.println(makeGood(s));
    }
}
