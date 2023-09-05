package Code;

public class recursiveGenerateFib {
	public static String generate(int n, String[] s) {
	  	if(s.length == n) return String.join(", ", s);
	  	String[] nextS = new String[s.length + 1];
	  	for(int i = 0; i < s.length; i++) {
	  		nextS[i] = s[i];
	  	}
	  	nextS[s.length] = s[s.length-1] + s[s.length-2];
	  	return generate(n, nextS);
		}
}
