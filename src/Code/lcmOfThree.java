package Code;

public class lcmOfThree {
	public static int lcmOfThree(int[] arr) {
		int lcm1 = arr[0] * arr[1] / GCF(arr[0], arr[1]);
		int lcm2 = lcm1 * arr[2] / GCF(lcm1, arr[2]);
		return lcm2;
	  }
	
	public static int GCF(int n1, int n2) {
		if(n1%n2 == 0) return n2;
		else {
			int temp = n1;
			n1 = n2; n2 = temp % n2;
		}
		return GCF(n1, n2);
	}
}
