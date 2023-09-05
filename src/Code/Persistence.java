package Code;

public class Persistence {
	public static int additivePersistence(int n) {
		int counter = 0;
		while(n/10 != 0) {
			int sum = 0;
			while(n/10 != 0) {
				sum += n%10;
				n /= 10;
			}
			n += sum;
			counter ++;
			System.out.println(n);
		}
		return counter;
	  }

	public static int multiplicativePersistence(long n) {
		int counter = 0;
		while(n/10 != 0) {
			long sum = 1;
			while(n/10!= 0) {
				sum *= n%10;
				n/=10;
			}
			n *= sum;
			counter ++;
		}
		return counter;
	  }
}
