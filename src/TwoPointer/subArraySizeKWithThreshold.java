package TwoPointer;

public class subArraySizeKWithThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        double avg = 0;
        int n = arr.length;
        for(int i = 0;i<k;i++){
            avg+=(double) arr[i]/k;
        }
        if(avg>=threshold){
            ans++;
        }
        int low = 0;
        int high = k;
        while(high<n){
            avg-=(double) arr[low++]/k;
            avg+=(double) arr[high++]/k;
            if(avg>=threshold){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
}
