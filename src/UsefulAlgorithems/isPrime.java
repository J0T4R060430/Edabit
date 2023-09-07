package UsefulAlgorithems;

public class isPrime {
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
