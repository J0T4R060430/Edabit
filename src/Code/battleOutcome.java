package Code;

public class battleOutcome {
	public static int battleOutcome(int num) {
		String n = num + "";
		String victory  = "";
		for(int i = 0; i < n.length(); i+=2) {
			if(i + 1 == n.length()) {
				victory += n.charAt(i);
			}else {
				if(n.charAt(i) > n.charAt(i+1)) {
					victory += n.charAt(i);
				}else if(n.charAt(i) < n.charAt(i+1)) {
					victory += n.charAt(i+1);
				}
			}
		}
		return Integer.parseInt(victory);
	  }
}
