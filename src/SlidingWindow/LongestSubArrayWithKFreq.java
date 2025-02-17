package SlidingWindow;
import java.util.*;
public class LongestSubArrayWithKFreq {
    public static int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int i = 0;
        int maxi  = 0;
        for(int j =0;j<n;j++){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            while(mp.get(nums[j])>k){
                mp.put(nums[i],mp.get(nums[i])-1);
                i++;
            }
            maxi = Math.max(maxi,j-i+1);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int [] nums = {1,4,4,3};
        int k = 1;
        System.out.println(maxSubarrayLength(nums,k));
    }
}
