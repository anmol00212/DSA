package Arrays;
import java.util.*;
public class miniBallon {
    public static int maxNumberOfBalloons(String text) {
        Map<Character,Integer> mp = new HashMap<>();
        char[] s = text.toCharArray();
        for(char it : s){
            mp.put(it,mp.getOrDefault(it,0)+1);
        }
        char[] b = {'b','a','l','o','n'};
        int mini = 2000000;
        for(char it : b){
            if(mp.containsKey(it)){
                int v = mp.get(it);
                if(it == 'l'){
                    v = v/2;
                }
                if(it == 'o'){
                    v = v/2;
                }
                mini = Math.min(mini,v);
                mp.put(it,v-1);
            }
            else{
                return 0;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        String s = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        System.out.println(maxNumberOfBalloons(s));
    }
}
