package Code;

public class ExtendVowels {
	public static String extendVowels(String w, int n) {
		if (n == 0) return w;
		if (n < 0) return "invalid";
		
	    String extended = "";
	    for (int i = 0; i < w.length(); i++) {
	    	char ch = w.charAt(i);
	    	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
	    			|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	    		for(int j = 0; j < n; j ++) {
	    		extended += ch;
	    		}
	    	}else {
	    		extended += ch;
	    	}
	    }
	    return extended;
	  }
}
