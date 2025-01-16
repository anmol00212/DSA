package Strings;
import java.util.*;
public class stringCompression {
    public static int compress(char[] chars) {
//        int ans = 0;
//        Map<Character,Integer> mp = new HashMap<>();
//        for(char it : chars){
//            mp.put(it,mp.getOrDefault(it,0)+1);
//        }
//        List<Character> c = new ArrayList<>();
//        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
//            if(entry.getValue() == 1){
//                c.add(entry.getKey());
//            }
//            else{
//                c.add(entry.getKey());
//                int val =entry.getValue();
//                String s = val+"";
//                for(int i = 0;i<s.length();i++){
//                    c.add(s.charAt(i));
//                }
//            }
//        }
//        ans = c.size();
//        return ans;
        int i=0;
        int n=chars.length;
        int j=0;
        if(n==1)
            return 1;
        while(i<n){
            int count=1;
            char charac=chars[i];
            while(i+1<n && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count==1){
                chars[j++]=charac;
            }
            else{
                if(count>1){
                    chars[j++]=charac;
                    String counterstring=count+"";
                    for(int r=0;r<counterstring.length();r++){
                        chars[j++]=counterstring.charAt(r);
                    }
                }
            }
            i++;
        }
        return j;
    }

    public static void main(String[] args) {
        char[] chars = {'a'};
        System.out.println(compress(chars));
    }
}
