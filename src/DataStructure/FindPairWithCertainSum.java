package DataStructure;
import java.util.*;
public class FindPairWithCertainSum {
    Map<Integer,Integer> mp1 = new HashMap<>();
    int[] arr1;
    int[] arr2;
    public void FindSumPairs(int[] nums1, int[] nums2) {
        int n = nums1.length;
        this.arr1 = nums1;
        this.arr2 = nums2;
        for(int i =0;i<n;i++){
            mp1.put(nums1[i], mp1.getOrDefault(nums1[i],0)+1);
        }
    }

    public void add(int index, int val) {
        arr2[index]+=val;
    }

    public int count(int tot) {
        int ans = 0;
        int M = arr2.length;
        for(int i = 0;i<M;i++){
            int val = tot - arr2[i];
            if(mp1.containsKey(val)){
                ans+=mp1.get(val);
            }
        }
        return ans;
    }
}
