package Stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder str = new StringBuilder();
        int num = 0;

        for(char c : s.toCharArray()){
            if(c>='0' && c<='9'){
                num = num*10+c-'0';
            }
            else if(c=='['){
                stringStack.push(String.valueOf(str));
                str = new StringBuilder();
                integerStack.push(num);
                num = 0;
            } else if (c==']') {
                StringBuilder temp = str;
                str = new StringBuilder(stringStack.pop());
                int count = integerStack.pop();

                while(count-->0){
                    str.append(String.valueOf(temp));
                }
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
    }
}
