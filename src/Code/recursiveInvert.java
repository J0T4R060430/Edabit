package Code;

public class recursiveInvert {
	public static String invert(String s) {
		return invert_(s, new StringBuilder(" ")).toString();
	}
	
	public static StringBuilder invert_(String s1, StringBuilder s2) {
		if(s1.length() == 0) return s2.reverse();
		char c = s1.charAt(0);
		if(Character.isAlphabetic(c)) {
			if(Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			}else {
				c = Character.toUpperCase(c);
			}
		}
		s2.append(c); s1 = s1.substring(1);
		return invert_(s1, s2);
	}
}
