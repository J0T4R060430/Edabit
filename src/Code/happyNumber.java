package Code;

public class happyNumber {
	public static boolean isHappy(int n) {
		if(n == 4) return false;
		if(n == 1) return true;
		int sum = 0;
		while(n > 0) {
			sum += Math.pow(n%10, 2);
			n /= 10;
		}
		System.out.println(sum);
		return isHappy(sum);
	}
}
