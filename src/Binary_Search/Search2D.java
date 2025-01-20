package Binary_Search;

public class Search2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0;
        int h = (m*n)-1;
        while(l<=h){
            int mid = (l+h)/2;
            int val = matrix[mid/m][mid%m];   //imp
            if(val == target){
                return true;
            }
            else if (val<target) {
                l++;
            }
            else{
                h--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1}};
        int target = 1;
        System.out.println(searchMatrix(matrix,target));
    }
}
