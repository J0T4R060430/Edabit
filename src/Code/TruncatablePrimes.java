package Code;

public class TruncatablePrimes {
	public static String truncatable(int num) {
		boolean left = true, right = true; int len = (int)(Math.log10(num)) + 1;
		if(String.valueOf(num).contains("0")) return "none";
		for(int i = 1; i <= len; i++) {
			int l = (int) (num % Math.pow(10, i));
			int r = (int) (num / Math.pow(10, i-1));
			if(!isPrime(l)) left = false;
			if(!isPrime(r))right = false;
		}
		if(left && right) {
			return "both";
		}else if(right) {
			return "right";
		}else if (left) {
			return "left";
		}else {
			return "none";
		}
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
