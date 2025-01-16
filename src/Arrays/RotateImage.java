package Arrays;
import java.util.*;
public class RotateImage {
    private static void transpose(int[][] m){
        int n = m.length;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }
    private static void rev(int[][] m){
        int n = m.length;
        for(int i=0;i<n;i++){
            int l = 0;
            int h = n-1;
            while(l<=h){
                int temp = m[i][l];
                m[i][l] = m[i][h];
                m[i][h] = temp;
                l++;
                h--;
            }
        }
    }
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        rev(matrix);
//        int n = matrix.length;
//        int[][] m = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j = 0;j<n;j++){
//                m[j][(n-1)-i] = matrix[i][j];
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j = 0;j<n;j++){
//                matrix[i][j] = m[i][j];
//            }
//        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
