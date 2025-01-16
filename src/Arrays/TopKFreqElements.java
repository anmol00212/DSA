package Arrays;

import java.util.*;
/*
*cal the freq of the elements using map
* put them in max-heap
*/
public class TopKFreqElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<n;i++){
            mp.putIfAbsent(nums[i],1);
            int inc = mp.getOrDefault(nums[i],1) + 1;
            mp.put(nums[i],inc);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i =0;i<k;i++){
            ans[i] = pq.poll()[0];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2,3,3,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
