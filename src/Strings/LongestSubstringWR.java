package Strings;
import java.util.*;
public class LongestSubstringWR {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0){
            return 0;
        }
        Set<Character> ss = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int i =0;i<n;i++){
            while(ss.contains(s.charAt(i))){
                ss.remove(s.charAt(left));
                left++;
            }
            ss.add(s.charAt(i));
            max = Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
