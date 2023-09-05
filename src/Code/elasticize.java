package Code;

public class elasticize {
	public static String elasticize(String word) {
		if (word.length() < 3) return word;
		if (word.length() %2 == 0) {
			String streched = "";
			for(int i = 0; i < word.length()/2; i++) {
				streched += Character.toString(word.charAt(i)).repeat(i+1);	
			}
			for(int i = 0; i < word.length()/2; i++) {
				
			}
			return streched;
		}else {
			return "";
		}
		
	}
}
