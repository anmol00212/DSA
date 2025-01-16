package TwoPointer;
import java.util.*;

public class ValidPalindrome {
    private static boolean isValid(char c){
        return (c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9');
    }
    public static boolean isPalindrome(String s) {
        StringBuilder r= new StringBuilder();
        int n = s.length();
        for(int i =0;i<n;i++){
            if(!isValid(s.charAt(i))) continue;
            else{
                r.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int nl = r.length();
        int i=0;
        int j = nl-1;
        while(i<=j){
            if(r.charAt(i) != r.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "Madam, in Eden, I'm Adam";
        System.out.println(isPalindrome(s));
    }
}
