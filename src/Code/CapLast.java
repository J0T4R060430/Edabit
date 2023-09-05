package Code;

public class CapLast {
	public static String capLast(String str) {
		String[] words = str.split(" ");
		String[] uppercase = new String[words.length];
		for (int i = 0; i<words.length; i++) {
			uppercase[i] = words[i].substring(0,words[i].length()-1) + words[i].substring(words[i].length()-1).toUpperCase();
		}
		return String.join(" ", uppercase);
	}
}
