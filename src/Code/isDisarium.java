package Code;

public class isDisarium {
	public static boolean isDisarium(int n) {
		char[] c = (n+"").toCharArray();
		int sum = 0, i= 0;
		for(i=0; i < c.length; i++) {
			sum += Math.pow(((int) c[i])-48, i+1);
		}
		System.out.println(sum);
		return sum == n;
	}
}
