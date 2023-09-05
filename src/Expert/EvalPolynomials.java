package Expert;

public class EvalPolynomials {
	public static int evalPolynomial(String poly, int num) {
		if (poly.length() == 0 || poly.contains("//") 
				|| poly.contains("print") ||  poly.contains("&")) return -1;
		String p = poly.replaceAll("x", ""+num);
		if (p.contains("(")) {
			int idx = p.indexOf(")");
			String s1 = p.substring(2,idx);
			String s2 = p.substring(idx+4,p.length()-1);
			return 2*getValue(s1)+ num* getValue(s2);
		}
		else if (p.contains("/")) {
			String[] s = p.split("[/]",0);
			int d1 = getValue(s[0]);
			int d2 = getValue(s[1]);
			return d1/d2;		
		}
		else return getValue(p);
	}
	public static int getValue(String s) {
		int idx = s.indexOf("^");
		if (idx != -1) {
			int b = Integer.parseInt(""+s.charAt(idx-1));
			int p = Integer.parseInt(""+s.charAt(idx+1));
			int m = (int)Math.pow(b, p);
			if (idx > 1) m *= Integer.parseInt(""+s.charAt(idx-2));
			return m;
		}
		idx = s.indexOf("+");
		if (idx != -1) {
			int d1 = Integer.parseInt(s.substring(0,idx));
			int d2 = Integer.parseInt(s.substring(idx+1));
			return d1+d2;
		}
		idx = s.indexOf("-");
		if (idx != -1) {
			int d1 = Integer.parseInt(s.substring(0,idx));
			int d2 = Integer.parseInt(s.substring(idx+1));
			return d1-d2;
		}
		return Integer.parseInt(s);	
	}		
}
