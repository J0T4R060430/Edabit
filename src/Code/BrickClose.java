package Code;

import java.util.Arrays;

public class BrickClose {
	public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
		int[] dimensions = new int[] {a,b,c};
		Arrays.sort(dimensions);
		return ((dimensions[0] <= w && dimensions[1] <= h) || (dimensions[1] <= w && dimensions[0] <= h));
	  }
}
