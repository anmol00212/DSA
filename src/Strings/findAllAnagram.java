package Strings;
import java.util.*;
public class findAllAnagram {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        else{
            Map<Character,Integer> pMap = new HashMap<>();
            Map<Character,Integer> sMap = new HashMap<>();
            for(int i = 0;i<p.length();i++){
                pMap.put(p.charAt(i),pMap.getOrDefault(p.charAt(i),0)+1);
                sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
            }
            if(pMap.equals(sMap)){
                ans.add(0);
            }
            int l = 0;
            int r = p.length();
            while(r<s.length()){
                char acquire = s.charAt(r++);
                sMap.put(acquire,sMap.getOrDefault(acquire,0)+1);

                char discard = s.charAt(l++);
                sMap.put(discard, sMap.get(discard)-1);
                if(sMap.get(discard) == 0){
                    sMap.remove(discard);
                }
                if(pMap.equals(sMap)){
                    ans.add(l);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s,p));
    }
}
