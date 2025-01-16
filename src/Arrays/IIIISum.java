package Arrays;
import java.util.*;
public class IIIISum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                Set<Long> s = new HashSet<>();
                for(int k = j+1;k<n;k++){
                    long sum = (long) (nums[i] + nums[j] + nums[k]);
                    long val = target - sum;
                    if(s.contains(val)){
                        List<Integer> ls = new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[k]);
                        ls.add((int)val);
                        ls.sort(Integer::compareTo);
                        ans.add(ls);
                    }
                    s.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> ans1 = new ArrayList<>(ans);
        return ans1;

    }
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums,target));
    }
}
