package Code;

public class fracToMixed {
	public static String mixedNumber(String frac) {
		String[] num = frac.split("/");
		int nume = Math.abs(Integer.parseInt(num[0])), denom = Integer.parseInt(num[1]);
		int gcf = GCF(nume, denom);
		nume /= gcf; denom /= gcf;
		int whole = nume / denom, fraction = nume % denom;
		String mixed = "";
		if(whole > 0 && fraction > 0) {
			mixed = String.format("%d %d/%d", whole, fraction, denom);
		}else if(whole > 0) {
			mixed = String.format("%d", whole);
		}else if(fraction > 0){
			mixed = String.format("%d/%d", fraction, denom);
		}else {
			mixed = "0";
		}
		if(frac.charAt(0) == '-') {
			return "-" + mixed;
		}else {
			return mixed;
		}
		
	}
	
	public static int GCF(int n1, int n2) {
		if(n1%n2 == 0) return n2;
		else {
			int temp = n1;
			n1 = n2; n2 = temp % n2;
		}
		return GCF(n1, n2);
	}
}
