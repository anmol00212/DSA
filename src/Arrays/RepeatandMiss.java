package Arrays;

import java.util.Arrays;

public class RepeatandMiss {
    public static int[] repeatedNumber(final int[] A) {
        int[] ans = new int[2];
        int n = A.length;
        boolean[] contain = new boolean[n];
        for(int it : A){
            if(contain[it-1]){
                ans[0] = it;
            }
            else{
                contain[it-1]= true;
            }
        }
        for(int i=0;i<n;i++){
            if(contain[i]==false){
                ans[1] = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]A = {3,1,2,3,5};
        System.out.println(Arrays.toString(repeatedNumber(A)));
    }
}
