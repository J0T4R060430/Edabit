package Code;

public class ProductOfPrimes {
	public static boolean productOfPrimes(int num) {
		if(isPrime(num)) return false;
		int n = 0;
		while(n <= Math.sqrt(num) +1) {
			n++;
			if(isPrime(n) && num%n == 0 && isPrime(num / n)) {
				return true;
			}
		}
		return false;
	  }
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i <= Math.pow(n, 0.5); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
