package Binary_Search;
import java.util.*;
import java.util.Arrays;

public class firstAndLastOccurance {
    public static int first(int [] arr, int target){
        int l = 0;
        int n = arr.length;
        //int [] ans = new int[2];
        int res = -1;
        int h = n-1;
        //First Occurance
        while(l<=h){
            int mid = l+((h-l)/2);
            if(arr[mid]==target){
                res = mid;
                h = mid- 1;
            }
            else if (arr[mid]>target) {
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return res;
    }
    public static int Last(int [] arr, int target){
        int l = 0;
        int n = arr.length;
        //int [] ans = new int[2];
        int res = -1;
        int h = n-1;
//        while(l<h){
//            int mid = l+((h-l)/2);
//            if(arr[mid] == target){
//                int f = 0;
//                int la = 0;
//                int a = mid;
//                while(arr[mid--]==target){
//                    f = mid+1;
//                }
//                mid =a;
//                while(arr[mid++]==target){
//                    la = mid-1;
//                }
//                ans[0] = f;
//                ans[1] = la;
//                return ans;
//            } else if (arr[mid]<target) {
//                l = mid+1;
//            }
//            else{
//                h = mid-1;
//            }
//        }
        //Last Occurance
            while(l<=h){
                int mid = l+((h-l)/2);
                if(arr[mid]==target){
                    res = mid;
                    l = mid+ 1;
                }
                else if (arr[mid]>target) {
                    h = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,5,6,7,7,8,8,9};
        int t = 3;
        System.out.println(Last(arr,t));
    }
}
