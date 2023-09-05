package Code;

import java.util.Arrays;

public class threeLetter {
	public static String[] threeLetterCollection(String s) {
		String[] subs = new String[s.length()-2];
		for(int i = 0; i < s.length()-2; i++) {
			subs[i] = s.substring(i, i+3);
		}
		Arrays.sort(subs);
		return subs;
	}
}
