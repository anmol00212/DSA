package Binary_Search;

import java.util.Arrays;

public class twoSumSortedA {
    private static int bS(int[] numbers, int low, int high, int val){
        while(low<=high){
            int mid = low+((high-low)/2);
            if(numbers[mid]==val){
                return mid;
            }
            else if(numbers[mid]<val){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n = numbers.length;
        if(n<2){
            return ans;
        }
        for(int i=0;i<n-1;i++){
            int val = target - numbers[i];
            int ind = bS(numbers,i+1,n-1,val);
            if(ind>0){
                ans[0] = i+1;
                ans[1] = ind+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int t = 9;
        System.out.println(Arrays.toString(twoSum(arr,t)));
    }
}
