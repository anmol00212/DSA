package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer>s = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.empty() && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
                if(s.empty()){
                    s.push(i);
                    ans[i] = 0;
                }
                else {
                    ans[i] = s.peek() - i;
                    s.push(i);
                }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }
}
