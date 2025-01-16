package Arrays;
import java.util.*;
public class PascalT {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i<2||j==i||j==0){
                    ls.add(1);
                }
                else {
                    int n1 = ans.get(i-1).get(j-1);
                    int n2 = ans.get(i-1).get(j);
                    ls.add(n1+n2);
                }
            }
            ans.add(ls);
        }
        return ans;
    }
    public static void main(String[] args) {
        int numR = 5;
        System.out.println(generate(numR));
    }
}
