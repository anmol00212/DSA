package Strings;

public class FirstPalindrome {
    private static Boolean isPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String firstPalindrome(String[] words) {
        for(int i = 0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}
