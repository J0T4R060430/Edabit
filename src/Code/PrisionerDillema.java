package Code;

public class PrisionerDillema {
	public static int[] getCoinBalances(String[] a, String[] b) {
		int p1 = 3, p2 = 3;
		for(int i = 0 ; i < a.length; i++) {
			if(a[i] == "steal" && b[i] == "steal") {
				
			}
			else if(a[i] == "steal" && b[i] == "share") {
				p1 += 3; p2 -= 1;
			}
			else if(a[i] == "share" && b[i] == "steal") {
				p1 -= 1; p2 += 3;
			}
			else if(a[i] == "share" && b[i] == "share") {
				p1 += 2; p2 += 2;
			}
		}
		return new int[] {p1,p2};
	  }
}
