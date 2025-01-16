package Arrays;

import java.util.*;
/*
* the main problem was the square one
* row - (sq/3)*3+i;  col - (sq%3)*3+j;
*/
public class ValidSudoku {
    public static boolean isValidSudoku(String[][] board) {
        for(int row = 0;row<9;row++){
            Set<String> s = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[row][i]==".") continue;
                if(s.contains(board[row][i])) return false;
                s.add(board[row][i]);
            }
        }
        for(int col = 0;col<9;col++){
            Set<String> s = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][col]==".") continue;
                if(s.contains(board[i][col])) return false;
                s.add(board[i][col]);
            }
        }
        for(int sq=0;sq<9;sq++){
            Set<String> s = new HashSet<>();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row = (sq/3)*3+i;
                    int col = (sq%3)*3+j;
                    if(board[row][col]==".") continue;
                    if(s.contains(board[row][col])) return false;
                    s.add(board[row][col]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String board[][] = {{"1","2",".",".","3",".",".",".","."},
                {"4",".",".","5",".",".",".",".","."},
                {".","9","8",".",".",".",".",".","3"},
                {"5",".",".",".","6",".",".",".","4"},
                {".",".",".","8",".","3",".",".","5"},
                {"7",".",".",".","2",".",".",".","6"},
                {".",".",".",".",".",".","2",".","."},
                {".",".",".","4","1","9",".",".","8"},
                {".",".",".",".","8",".",".","7","9"}};
        System.out.println(isValidSudoku(board));
    }
}
