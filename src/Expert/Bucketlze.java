package Expert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bucketlze {
    public static String[] bucketize(String phrase, int n) {
        String[] words = phrase.split(" ");
        ArrayList<String> l = new ArrayList<String>();
        String c = "";
        for(String w : words){
            if(c.length() == 0){
                if(w.length() <= n){
                    c = w;
                }else{
                    l.add("");
                }
            }else{
                if(c.length() + 1 + w.length() <= n){
                    c += " " + w;
                }else{
                    l.add(c);
                    c = w;
                }
            }
        }
        l.add(c);
        if(Collections.frequency(l, "") == l.size()){
            return new String[0];
        }else{
            return Arrays.copyOf(l.toArray(), l.size(), String[].class);
        }
    }
}
