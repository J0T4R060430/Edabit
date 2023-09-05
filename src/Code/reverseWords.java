package Code;

public class reverseWords {
	public static String reverseWords(String s) {
		String reverse = "";
		s = s.replaceAll("[ ]+", "-");

		String[] words = s.split("-");
		for(int i = words.length-1; i >= 0; i--) {
			if(words[i].length() > 0) {
				reverse += words[i] + " ";
			}
		}
		return reverse.substring(0, reverse.length()-1);
	  }
}
