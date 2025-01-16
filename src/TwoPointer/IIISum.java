package TwoPointer;
import java.util.*;

public class IIISum {
    public static List<List<Integer>> threeSum(int[] nums) {
        /*Set<List<Integer>> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hs = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i]+nums[j]);
                if(hs.contains(third)){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(third);
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    Collections.sort(ls);
                    s.add(ls);
                }
                hs.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> it : s){
            ans.add(it);
        }
        return ans;
         */
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])  continue;
            int l = i+1;
            int h = n-1;
            while(l<h){
                if(nums[i]+nums[l]+nums[h]==0){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[l]);
                    ls.add(nums[h]);
                    ans.add(ls);
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1]) l++;
                    while(l<h && nums[h]==nums[h+1]) h--;
                }
                else if(nums[i]+nums[l]+nums[h]<0){
                    l++;
                }
                else {
                    h--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
