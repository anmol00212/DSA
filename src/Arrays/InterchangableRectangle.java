package Arrays;
import java.util.*;
public class InterchangableRectangle {
    public static long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Long> mp = new HashMap<>();
        long ans = 0;
        for(int[] it : rectangles){
            double w = it[0];
            double h = it[1];
            double diff = (double) w/h;
            if(mp.containsKey(diff)){
                ans+=mp.get(diff);
            }
            mp.put(diff,mp.getOrDefault(diff,0L)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{4,5},{7,8}};
        System.out.println(interchangeableRectangles(rectangles));
    }
}
