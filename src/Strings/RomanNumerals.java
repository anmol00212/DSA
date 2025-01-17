package Strings;
import java.util.*;
public class RomanNumerals {
    public static int romanToInt(String s) {
        int[] roman = new int['X'];
        roman['I'-64] = 1;
        roman['V'-64] = 5;
        roman['X'-64] = 10;
        roman['L'-64] = 50;
        roman['C'-64] = 100;
        roman['D'-64] = 500;
        roman['M'-64] = 1000;
        int ans = 0;
        char[] ss = s.toCharArray();
        for(int i = 0;i<s.length()-1;i++){
            if(roman[s.charAt(i)-64]<roman[s.charAt(i+1)-64]){
                ans-=roman[ss[i]-64];
            }
            else{
            ans+=roman[ss[i]-64];
            }
        }
        ans+=roman[s.charAt(s.length()-1)-64];
        return ans;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
