package Strings;
import java.util.*;
public class RansonNotes {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] rArr = new int[26];
        int[] mArr = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            rArr[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            mArr[magazine.charAt(i)-'a']++;
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(mArr[ransomNote.charAt(i)-'a']<rArr[ransomNote.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "aaaaaaab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
