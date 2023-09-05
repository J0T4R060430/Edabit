package Code;

public class closeInSum {
	public static int closingInSum(long n) {
		String num = n+"";
		int s = 0, l = num.length();
		for(int i = 0; i < l/2; i++) {
			String first = num.substring(i, i+1);
			String last = num.substring(l-i-1,l-i);
			s += Integer.parseInt(first + last);
		}
		if(l % 2 == 1) s += Integer.parseInt(num.substring(l/2, l/2+1));
		return s;
	}
}
