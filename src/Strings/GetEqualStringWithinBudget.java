package Strings;

public class GetEqualStringWithinBudget {
    public static int equalSubstring(String s, String t, int maxCost) {
        int cnt = 0;
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(maxCost<=0){
                return cnt;
            }
            int val = Math.abs(s.charAt(i)-t.charAt(i));
            if(maxCost-val>=0){
                maxCost -= val;
                cnt++;
            }
        }
        if(cnt == 0){
            cnt = 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "";
        int max = 0;

    }
}
