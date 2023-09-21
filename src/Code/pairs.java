package Code;

public class pairs {
	public static int[][] pairs(int[] arr) {
		int l = (arr.length+1)/2;
		int[][] pairs = new int[l][];
		for(int i = 0; i < l; i++) {
			pairs[i] = new int[] {arr[i], arr[arr.length-i-1]};
		}
		return pairs;
	  }
}
