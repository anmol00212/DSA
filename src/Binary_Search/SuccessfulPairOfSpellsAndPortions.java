package Binary_Search;

import java.util.Arrays;

public class SuccessfulPairOfSpellsAndPortions {

    private int isValid(int[] portions, int spell, long success){
        int low = 0;
        int m = portions.length;
        int high = m-1;
        int cnt = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((long) spell*portions[mid]>=success){
                cnt= Math.max( (m-1) - mid,cnt);
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return cnt;
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] ans = new int[n];

        Arrays.sort(potions);
        for(int i = 0;i<n;i++){
            ans[i] = isValid(potions,spells[i],success);
        }
        return ans;
    }
}
