package Stack;
import java.util.*;
public class ValidParentheses {
    public static boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for(char cc : c){
            if (cc == '{' || cc == '(' || cc == '[') {
                st.push(cc);
            } else if (cc == '}') {
                int ss = st.pop();
                if(ss!='{') return false;
            }
            else if (cc == ')') {
                int ss = st.pop();
                if(ss!='(') return false;
            }
            else if (cc == ']') {
                int ss = st.pop();
                if(ss!='[') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
