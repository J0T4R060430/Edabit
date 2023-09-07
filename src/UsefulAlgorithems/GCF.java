package UsefulAlgorithems;

public class GCF {
	public static int GCF(int n1, int n2) {
		if(n1%n2 == 0) return n2;
		else {
			int temp = n1;
			n1 = n2; n2 = temp % n2;
		}
		return GCF(n1, n2);
	}
}
