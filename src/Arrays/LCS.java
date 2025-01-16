package Arrays;

import java.util.*;
/*
*
*/
public class LCS {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(Integer it : nums){
            s.add(it);
        }
        int count = 0;
        for(Integer it : s){
            int ccount = 0;
            if(!s.contains(it-1)){
                ccount = 1;
                while(s.contains(it+ccount)){
                    ccount++;
                }
            }
            count = Math.max(count,ccount);
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {2,20,4,10,3,4,5};
        System.out.println(longestConsecutive(nums));
    }
}
