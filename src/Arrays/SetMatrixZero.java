package Arrays;
import java.util.*;
public class SetMatrixZero {

//    private static void markRow(int[][] matrix, int row){
//        int col = matrix[0].length;
//        for(int i=0;i<col;i++){
//            if(matrix[row][i]!=0){
//                matrix[row][i]=-1;
//            }
//        }
//    }
//    private static void markCol(int[][] matrix, int col){
//        int row = matrix.length;
//        for(int i=0;i<row;i++){
//            if(matrix[i][col]!=0){
//                matrix[i][col]=-1;
//            }
//        }
//    }
    public static int[][] setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] markrow = new int[row];
        int[] markcol = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
//                     markRow(matrix,i);
//                     markCol(matrix,j);
                    markrow[i]=1;
                    markcol[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(markrow[i]==1 || markcol[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println(Arrays.deepToString(setZeroes(matrix)));
    }
}
