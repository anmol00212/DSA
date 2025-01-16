package Arrays;
import java.util.*;
public class SortZOT {
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        int z=0;
        int o = 0;
        int t = n-1;
        while(o<=t){
            if(nums[o]==0){
                swap(nums,z,o);
                o++;
                z++;
            }
            else if(nums[o]==1){
                o++;
            }
            else{
                swap(nums,o,t);
                t--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}
