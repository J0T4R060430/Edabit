package Code;

public class canPalindrome {
	public static boolean isPalindromePossible(String str) {
		int oddLen = 0; int oneLen = 0; int l = str.length(); int count = 0;
		for(char c : str.toCharArray()) {
			count = l - str.replaceAll(c + "", "").length();
			if(count == 1) oneLen ++;
			else if (count % 2 == 1) oddLen ++;
		}
		return oneLen + oddLen <= 1;
}
}
