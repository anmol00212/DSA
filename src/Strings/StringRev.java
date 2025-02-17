package Strings;

public class StringRev {
    public static String reverseWords(String s) {
        String[] ss = s.split(" ");
        int i = 0;
        int j = ss.length-1;
        while(i<j){
            String temp = ss[i];
            ss[i] = ss[j];
            ss[j] = temp;
            i++;
            j--;
        }
        StringBuilder result = new StringBuilder();
        for (String word : ss) {
            if (!word.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}

