package Arrays;
import java.util.*;
public class largestRight {
    public static int[] replaceElements(int[] arr) {
        int n  = arr.length;
        int largest = arr[n-1];
        if(n==1){
            arr[0] = -1;
            return arr;
        }
        int j = n-2;
        int i = n-1;
        arr[i] = -1;
        while(j>=0){
            if(arr[i]>largest){
                largest = arr[i];
            }
            int temp = arr[j];
            arr[j] = Math.max(largest,arr[i]);
            largest = Math.max(largest,temp);
            i--;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
