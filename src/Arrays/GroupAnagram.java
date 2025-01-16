package Arrays;

import java.util.*;
/*
*created a map of hash and words
*/
public class GroupAnagram {

    public static List<List<String>> grpAnagram(String[] strs){
        Map<String,List<String>> mp = new HashMap<>();
        for(String s : strs){
            int alp[] = new int[26];
            for(char c : s.toCharArray()){
                alp[c-'a']++;
            }
            String key = Arrays.toString(alp);
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }

    public static void main(String[] args) {
        String strs[] = {"act","pots","tops","cat","stop","hat"};
        System.out.println(grpAnagram(strs));
    }
}
