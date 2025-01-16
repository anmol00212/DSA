package Arrays;
import java.util.*;
public class MonoArray {
    public static boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n<2){
            return true;
        }
        boolean isInc = false;
        if(nums[0]<nums[1]){
            isInc = true;
        }
        for(int i=1;i<n;i++){
            if(isInc && nums[i-1]>nums[i]){
                return false;
            }
            if(!isInc && nums[i-1]<nums[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {6,5,3};
        System.out.println(isMonotonic(nums));
    }
}
