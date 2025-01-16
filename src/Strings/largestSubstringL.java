package Strings;

import java.util.HashSet;
import java.util.*;
public class largestSubstringL {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int ans = 0;
        int n = s.length();
        char[] ss = s.toCharArray();
        int i = 0;
        Map<Character,Integer> mp = new HashMap<>();
        for(char it : ss){
            if(mp.containsKey(it)){
                ans = Math.max(ans,i-mp.get(it));
            }
            mp.putIfAbsent(it,i);
            i++;
        }
        return ans-1;
    }

    public static void main(String[] args) {
        String s = "mgntdygtxrvxjnwksqhxuxtrv";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
