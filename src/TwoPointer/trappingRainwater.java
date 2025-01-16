package TwoPointer;
import java.util.*;

public class trappingRainwater {
    public static int trap(int[] height) {
        /*
        int n = height.length;
        int[] maxL = new int[n];
        int[] maxR = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            if(height[i]>max){
                max = height[i];
            }
            maxL[i] = max;
        }
        max = 0;
        for(int i=n-1;i>=0;i--){
            if(height[i]>max){
                max = height[i];
            }
            maxR[i] = max;
        }
        System.out.println(Arrays.toString(maxL));
        int ans = 0;
        for(int i=0;i<n;i++){
            ans+=Math.min(maxL[i],maxR[i])-height[i];
        }
        return ans;
         */
        int n = height.length;
        int l = 0;
        int r = n-1;
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        while(l<r) {
            if (height[l] <= height[r]) {
                if (height[l] >= lmax) lmax = height[l];
                else {
                    ans += lmax - height[l];
                }
                l++;
            } else {
                if (height[r] >= rmax) rmax = height[r];
                else {
                    ans += rmax - height[r];
                }
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
