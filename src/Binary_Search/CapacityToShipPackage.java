package Binary_Search;

public class CapacityToShipPackage {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int totalWeight = 0;
        int minWeight = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int w : weights){
            totalWeight+=w;
            minWeight = Math.min(minWeight,w);
        }
        int low = minWeight;
        int high = totalWeight;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(totalWeight/mid <=days){
                ans = totalWeight/mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
