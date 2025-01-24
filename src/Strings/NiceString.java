package Strings;
import java.util.*;
public class NiceString {
    private static Boolean isNiceString(String s){
        Set<Character> ss = new HashSet<>();
        for(char str : s.toCharArray()){
            ss.add(str);
        }
        for(char str : ss){
            if(!ss.contains(Character.toLowerCase(str)) || !ss.contains(Character.toUpperCase(str))){
                return false;
            }
        }
        return true;
    }
    public static String longestNiceSubstring(String s) {
        String ans = "";
        if(s.length() == 1){
            return ans;
        }
        for(int i=0;i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
                String str = s.substring(i,j+1);
                if(isNiceString(str) && ans.length() < str.length()){
                    ans = str;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "YazaAay";
        System.out.println(longestNiceSubstring(s));
    }
}
