package Strings;
import java.util.*;
public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Map<Character,Integer> mp = new HashMap<>();
        char[] jArr = jewels.toCharArray();
        for(char it : jArr){
            mp.put(it,0);
        }
        char[] sArr = stones.toCharArray();
        for(char it : sArr){
            if(mp.containsKey(it)){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
