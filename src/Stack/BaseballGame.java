package Stack;
import java.util.*;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        Stack<String> s = new Stack<>();
        int n = operations.length;
        for(int i = 0;i<n;i++){
            if(Objects.equals(operations[i], "C")){
                if(!s.empty()){
                    s.pop();
                }
            }
            else if(Objects.equals(operations[i], "D")){
                int a = Integer.parseInt(s.peek());
                a = a*2;
                String aa= Integer.toString(a);
                s.push(aa);
            }
            else if(Objects.equals(operations[i], "+")){
                String a = s.elementAt(s.size()-2);
                String b = s.peek();
                int aa = Integer.parseInt(a);
                int bb = Integer.parseInt(b);
                int cc = aa+bb;
                String c = Integer.toString(cc);
                s.push(c);
            }
            else{
                s.push(operations[i]);
            }
        }
        int ans = 0;
        while(!s.empty()){
            String i = s.pop();
            ans+=Integer.parseInt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
}
