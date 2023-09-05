package Code;

public class paratiyAnalysis {
	public static boolean parityAnalysis(int num) {
		int s = 0; int ref = num;
		while (num >= 1) {
			int n = num / 10;
			int d = num - n * 10;
			s += d; num = n;
			System.out.println(n);
		}
		return ((ref - s)%2 == 0);
	  }
}
