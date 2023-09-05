package Code;

public class WordInitials {
	public static boolean canComplete(String initial, String word) {
		for(char c : word.toCharArray()) {
			if(c == initial.charAt(0)) {
				initial = initial.substring(1);
			}
		}
		return initial.equals("");
	}
}
