package Expert;

import java.util.ArrayList;

public class PatanthatheseCutter {
    public static String[] split(String str) {
        ArrayList<String> words = new ArrayList<String>();
//		String[] words = new String[str.length()];
        int layer = 0, lastpos = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '('){
                layer ++;
            }else{
                layer --;
            }
//			System.out.println(layer);
            if(layer == 0){
//				System.out.println("here");
                words.add(str.substring(lastpos, i+1));
//				words[counter] = str.substring(lastpos, i+1);
                lastpos = i+1;
            }
        }
        if(words.size() == 0) return new String[0];
        return String.join(" ", words).split(" ");
    }
}
