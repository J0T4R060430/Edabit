package Code;

public class isFactorial {
	public static boolean isFactorial(int n) {
		int f = 1, k = 1;
		while(f < n) {
			f*=k;k++;
			System.out.println(f);
		}
		return f == n;
	}
}
