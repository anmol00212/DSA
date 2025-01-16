package TwoPointer;
import java.util.*;
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        /*Map<Integer,Integer> mp = new HashMap<>();
        int cnt =1;
        for(Integer it : numbers){
            int req = target-it;
            if(mp.containsKey(req)){
                return new int[] {mp.get(req),cnt};
            }
            mp.putIfAbsent(it,cnt);
            cnt++;
        }
        return new int[0];
        */
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(numbers[i]+numbers[j] == target){
                return new int[] {i+1,j+1};
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int target = 3;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
