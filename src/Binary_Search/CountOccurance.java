package Binary_Search;
import java.util.*;
public class CountOccurance {

    private static int count(int [] arr, int t){
        int resf = firstAndLastOccurance.first(arr, t);
        int resl = firstAndLastOccurance.Last(arr, t);
        if(resf==-1){
            return -1;
        }
        int cnt  = (resl-resf)+1;

        return cnt;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,5,6,7,7,8,8,9};
        int t = 10 ;
        System.out.println(count(arr,t));
    }
}
