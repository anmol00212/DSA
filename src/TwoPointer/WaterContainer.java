package TwoPointer;
import java.util.*;

public class WaterContainer {
    public static int maxArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        int l = 0;
        int h = n-1;
        int diff = n-1;
        while(l<h){
            int maxi = Math.min(heights[l],heights[h])*diff;
            if(maxi>max){
                max = maxi;
            }
            if(heights[l]<=heights[h]){
                l++;
                diff--;
            }
            else if(heights[l]>heights[h]){
                h--;
                diff--;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(heights));
    }
}
