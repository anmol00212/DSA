package Arrays;
import java.util.*;
public class uniquePath {
    private static int path(int i,int j,int m, int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        else{
        return path(i+1,j,m,n)+path(i,j+1,m,n);
        }
    }
    public static int uniquePaths(int m, int n) {
        int cnt = path(0,0,m,n);
        return cnt;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m,n));
    }
}
