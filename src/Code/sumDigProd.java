package Code;

public class sumDigProd {
	public static long sumDigProd(int... args) {
		int sum = 0;
		for(int arg : args) sum += arg;
		System.out.println(sum);
		while(sum / 10 != 0) {
			int n = 1;
			while(sum / 10 != 0) {
				n *= sum%10;
				sum/=10;
			}
			sum *= n;
		}
		return sum;
	}
}
