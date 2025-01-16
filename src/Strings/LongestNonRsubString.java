package Strings;
import java.util.*;
public class LongestNonRsubString {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        char[] ss= s.toCharArray();
        int cnt = 1;
        int i = 0;
        int cnt1=0;
        Map<Character,Integer> mp = new HashMap<>();
        for(char it : ss){
            if(mp.containsKey(it)){
                int c = i-mp.get(it);
                cnt = Math.max(c,cnt);
                mp.clear();
                mp.put(it,i);
                i++;
                cnt1=1;
            }
            else{
                cnt1++;
                mp.put(it,i);
                i++;

            }
            cnt = Math.max(cnt1,cnt);
        }

        return cnt;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
