package Code;

import java.util.Arrays;

public class TrailingZero {
	public static String removeLeadingTrailing(String n) {
		String[] s = n.split("\\.");
		System.out.println(Arrays.toString(s));
		if(s.length == 1) {
			for(int i = 0; i < s[0].length(); i++) {
				if (s[0].charAt(i) != '0') {
					return s[0].substring(i);
				}
			}
			return "0";
		}else {
			for(int i = 0; i < s[0].length(); i++) {
				if (s[0].charAt(i) != '0') {
					s[0] = s[0].substring(i);
					break;
				}
			}
			if(s[0].charAt(0) == '0') s[0] = "0";
			for(int i = s[1].length()-1; i >= 0; i--) {
				if(s[1].charAt(i) != '0') {
					s[1] = s[1].substring(0,i+1);
					break;
				}
			}
			return s[1].charAt(s[1].length()-1) == '0' ? s[0]: s[0] + "." + s[1];
		}
	}
}
