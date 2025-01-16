package Arrays;
import java.util.*;
public class GoodPair {
    public static int numIdenticalPairs(int[] nums) {
       int n = nums.length;
       HashMap<Integer,Integer> mp = new HashMap<>();
       int ans = 0;
       for(int it : nums){
           int cnt =mp.getOrDefault(it,0);
           mp.put(it,cnt+1);
           ans+=cnt;
       }
       return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
