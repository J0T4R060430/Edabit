package Code;

public class multiGCF {
	public static int gcd(int[] arr) {
		if(arr.length == 1) return arr[0];
		int[] nextArr = new int[arr.length-1];
		for(int i = 0; i < arr.length-1; i++) {
			nextArr[i] = GCF(arr[i], arr[i+1]);
		}
		return gcd(nextArr);
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
