package Arrays;

import java.util.Arrays;
/**
 * in this created a prefix & Suffix Multiply array except for the element on the given index.
 */


public class productArray {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int prefixSum[] = new int[n];
        int suffixSum[] = new int[n];
        prefixSum[0] = 1;
        suffixSum[n-1] = 1;
        for(int i=1;i<n;i++){
            prefixSum[i] = nums[i-1]*prefixSum[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffixSum[i] = nums[i+1]*suffixSum[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i] = prefixSum[i]*suffixSum[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
