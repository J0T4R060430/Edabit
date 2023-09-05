package Code;

import java.math.BigInteger;

public class isApocalyptic {
	public static String isApocalyptic(int number) {
		BigInteger n;
		n = BigInteger.ONE;
		while (number > 0) {
			n = n.multiply(BigInteger.valueOf(2));
			number--;
		}
		
		String strn = n.toString();
		
		int dif = strn.length()-strn.replaceAll("666", "  ").length();
		
		switch(dif) {
		case 0: return "Safe";
		case 1: return "Single";
		case 2: return "Double";
		case 3: return "Triple";
		}
		return null;
	}
}
