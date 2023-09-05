package Code;

public class NumRectangle {
	public static int rectangles(int step) {
		int sum = 0;
		for(int i = 1; i <= step; i++) {
			for(int j = 1; j <= step; j++) {
				sum += i*j;
			}
		}
		return sum;
	  }
}
