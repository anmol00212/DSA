package Arrays;
import java.util.*;

public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int csum = nums[0];
        for(int i=1;i<n;i++){
            if(csum+nums[i]<nums[i]){
                csum = nums[i];
            }
            else{
                csum = csum+nums[i];
            }
            if(csum>sum) sum = csum;

        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
