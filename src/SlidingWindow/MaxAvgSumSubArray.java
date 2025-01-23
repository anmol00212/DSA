package SlidingWindow;

public class MaxAvgSumSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(n<k){
            return 0;
        }
        if(n==1){
            return (double)nums[0];
        }
        int start = 0;
        int end = k;
        double avg = 0;
        for(int  i = 0;i<k;i++){
            avg = avg+(double)nums[i]/k;
        }
        double maxAvg = avg;
        while(end<nums.length){
            avg = avg - (double) nums[start++]/k;
            avg = avg + (double) nums[end++]/k;
            maxAvg = Math.max(avg,maxAvg);
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        int[] nums = {9,7,3,5,6,2,0,8,1,9};
        int k = 6;
        System.out.println(findMaxAverage(nums,k));
    }
}
