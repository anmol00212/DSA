package Arrays;
import java.util.*;
public class BestProfitTime {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int low = prices[0];
        int high = prices[1];
        if(high-low>max){
            max = high-low;
        }
        for(int i=1;i<n;i++){
            if(prices[i]<low){
                low = prices[i];
                high = prices[i];
            }
            if(prices[i]>high){
                high = prices[i];
            }
            max = Math.max(high-low,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
