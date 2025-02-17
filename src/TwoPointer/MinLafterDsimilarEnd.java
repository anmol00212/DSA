package TwoPointer;

public class MinLafterDsimilarEnd {
    public static int minimumLength(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j && s.charAt(i)==s.charAt(j)){
            char comp = s.charAt(i);
            while(i<=j && s.charAt(i)==comp){
                i++;
            }
            while(i<=j && s.charAt(j)==comp){
                j--;
            }
        }
        return j-i+1;
    }
    public static void main(String[] args) {
        String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb";
        System.out.println(minimumLength(s));
    }
}
