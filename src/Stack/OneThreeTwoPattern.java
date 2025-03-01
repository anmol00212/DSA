package Stack;

import java.util.Stack;

public class OneThreeTwoPattern {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int thirdElement = Integer.MIN_VALUE;
        for(int i = n-1;i>=0;i++) {
            if(nums[i]<thirdElement){
                return true;
            }
            while (!s.empty() && s.peek()<nums[i]){
                thirdElement = s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
}
