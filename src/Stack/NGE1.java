package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NGE1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Map<Integer,Integer> nge = new HashMap<>();
        int m = nums1.length;
        int[] ans = new int[m];
        Stack<Integer> s = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while(!s.empty() && s.peek()<=nums2[i]){
                s.pop();
            }
            if(s.empty()){
                nge.put(nums2[i],-1);
            }
            else{
                nge.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }
        for(int i = 0;i<m;i++){
            ans[i] = nge.get(nums1[i]);
        }
        return ans;
    }
}
