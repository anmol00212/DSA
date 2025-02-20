package Stack;

import java.util.Objects;
import java.util.Stack;

public class ERPN {
    public static int evalRPN(String[] t) {
        Stack<Integer> s = new Stack<>();
        int n = t.length;
        for (String string : t) {
            if (string!="+" && string!="*" && string!="-" && string!="/") {
                int a = Integer.parseInt(string);
                s.push((int) a);
            }
            else{
                int a = s.pop();
                int b = s.pop();
                if(string=="+"){
                    int c = a+b;
                    s.push(c);
                } else if (string=="-") {
                    int c = b-a;
                    s.push(c);
                }
                else if (string=="*") {
                    int c = a*b;
                    s.push(c);
                }
                else if (string=="/") {
                    int c = b/a;
                    s.push(c);
                }
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        String[] t = {"2","1","+","3","*"};
        System.out.println(evalRPN(t));
    }
}
