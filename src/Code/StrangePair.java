package Code;


public class StrangePair {
	public static boolean isStrangePair(String s1, String s2) {
		if(s1.length() == s2.length() && s1.length() == 0) {
			return true;
		}else if (s1.length() == 0 || s2.length() == 0) {
			return false;
		}

		if(s1.charAt(0) == s2.charAt(s2.length()-1)) {
			if(s2.charAt(0) == s1.charAt(s1.length()-1)) {
				return true;
			}
		}else if(s2.charAt(0) == s1.charAt(s1.length()-1)) {
			if(s1.charAt(0) == s2.charAt(s2.length()-1)) {
				return true;
			}
		}
		
		return false;
	}
}
