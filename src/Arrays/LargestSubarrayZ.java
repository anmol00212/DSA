package Arrays;

import java.util.HashMap;
import java.util.*;
public class LargestSubarrayZ {
    public static int intMax(int[] arr){
        int n = arr.length;
        int ans = 0;
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        if(prefixSum[0]==0){
            ans = 1;
        }
        for(int i=1;i<n;i++){
            prefixSum[i] = arr[i]+prefixSum[i-1];
            if(prefixSum[i]==0){
                ans = i+1;
            }
        }
        Map<Integer,Integer> mp = new HashMap<>();
        int i = 0;
        for(int it : prefixSum){
            int cnt = 0;
            if(mp.containsKey(it)){
                cnt = i-mp.get(it);
                ans = Math.max(ans,cnt);
            }
            mp.putIfAbsent(it,i);
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0 ,36, 55, 12, -69, -81, -93, 13, -68, 86, -64, -50, 88, 41, -95, -89, -78, -14, -23, 93};
        System.out.println(intMax(arr));
    }
}
