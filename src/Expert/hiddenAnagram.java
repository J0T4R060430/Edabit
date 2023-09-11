package Expert;

import java.util.Arrays;

public class hiddenAnagram {
    public static String hiddenAnagram(String t, String p) {
        t = t.replaceAll("[^a-zA-Z]", "").toLowerCase();
        p = p.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] P = p.toCharArray();int l = p.length();
        Arrays.sort(P);
        for(int i = 0; i <= t.length()-l; i++){
            char[] T = t.substring(i, i+l).toCharArray();
            Arrays.sort(T);
            if(Arrays.equals(T,P)){
                return t.substring(i, i+l);
            }
        }
        return "noutfond";
    }
}
