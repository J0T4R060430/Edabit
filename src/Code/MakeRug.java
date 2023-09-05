package Code;
import java.util.Optional;

public class MakeRug {
	public static String[] makeRug(int m, int n, Optional<String> s) {
	    String row = "";
	    String[] rug = new String[n];
	    if (s.isEmpty()) {
	    	for (int i = 0; i < m; i++) {
		    	row += "#";
		    }
		    for (int i = 0; i < n; i++) {
		    	rug[i] = row;
		    }
	    }else {
	    for (int i = 0; i < m; i++) {
	    	row += s;
	    }
	    for (int i = 0; i < n; i++) {
	    	rug[i] = row;
	    }
	    }
	    return rug;
	  }
}
