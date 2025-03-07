package Binary_Search;

import java.util.Arrays;

public class MinimizeTheMaxPair {

    private boolean solve(int[] nums, int n, int p, int cap){
        for(int i = 1;i<n;i++){
            if(nums[i]-nums[i-1]<=cap){
                i++;
                p--;
            }
        }
        if(p<=0){
            return true;
        }
        else{
            return false;
        }
    }

    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int low = 0;
        int high = nums[n-1];
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(solve(nums,n,p,mid)){
                ans = Math.min(ans,mid);
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }
}
