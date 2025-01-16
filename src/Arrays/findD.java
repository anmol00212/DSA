package Arrays;
import java.util.*;
public class findD {
    public static int findDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int i = 0;
        for(int it : nums){
            if(mp.containsKey(it)){
                return it;
            }
            else{
                mp.put(it,i);
                i++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2};
        System.out.println(findDuplicate(nums));
    }
}
