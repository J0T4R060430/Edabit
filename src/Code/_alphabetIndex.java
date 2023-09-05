package Code;

public class _alphabetIndex {
	public static String alphabetIndex(String[] alphabet, String s) {
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			String str = s.substring(i, i+1).toLowerCase();
			for(int j = 0; j < alphabet.length; j++) {
				if(str == alphabet[j]) {
					if(j > max) {
						max = j;
					}
					break;
				}
			}
		}
		return (max+1) + s.substring(max,max+1).toLowerCase();
	  }
}
