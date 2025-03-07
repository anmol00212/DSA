package Binary_Search;

import java.util.Arrays;

public class KokoBanana {

    private int reqTime(int[] piles, int hourly){
        int totalhrs = 0;
        for(int i =0;i<piles.length;i++){
            totalhrs+=Math.ceil(piles[i]/hourly);
        }
        return totalhrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int low = 1;
        int high = piles[n-1];
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            int req = reqTime(piles,mid);
            if(req<=h){
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
}
