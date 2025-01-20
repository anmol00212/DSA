package Strings;

public class reverseTheString {
    public static void reverseString(char[] s) {
        int l = 0;
        int h = s.length-1;
        while(l<h){
            char temp = s[l];
            s[l] = s[h];
            s[h] = temp;
            l++;
            h--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(int i = 0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
