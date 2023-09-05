package Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class commonLastVowel {
	public static String commonLastVowel(String str) {
        str = str.toLowerCase();
        String[] a = {Integer.toString(str.length() - str.replaceAll("a","").length()), "a"};
        String[] e = {Integer.toString(str.length() - str.replaceAll("e","").length()), "e"};
        String[] i = {Integer.toString(str.length() - str.replaceAll("i","").length()), "i"};
        String[] o = {Integer.toString(str.length() - str.replaceAll("o","").length()), "o"};
        String[] u = {Integer.toString(str.length() - str.replaceAll("u","").length()), "u"};

        String[][] vowels = {a, e, i, o, u};

        int longest = 0;
        for(int x = 0; x < vowels.length; x++) {
            if(Integer.parseInt(vowels[x][0]) > longest) {
                longest = x;
            }
        }
        return vowels[longest][1];
    }
//	public static String commonLastVowel(String str) {
//		int a = 0, e = 0, i = 0, o = 0, u = 0, y = 0;
//		String[] words = str.split(" ");
//		for(String word : words) {
//			for (int p = word.length()-1; p >= 0; p--) {
//				switch(Character.toLowerCase(word.charAt(i))) {
//					case 'a':a++;break;
//					case 'e':e++;break;
//					case 'i':i++;break;
//					case 'o':o++;break;
//					case 'u':u++;break;
//					case 'y':y++;break;
//				}
//			}
//		 int max = Collections.min(Arrays.asList(new Integer[] {a,e,i,o,u,y}));
//		 return "aeiouy".charAt(new ArrayList<String>() {a,e,i,o,u,y});
//		 }
//		}
//	}
}
