package Code;

import java.util.Arrays;

public class luckySeven {
	public static boolean luckySeven(int[] r) {
		if (r.length < 3) {
			return false;
		}
		Arrays.sort(r);
		for(int i = 0; i < r.length; i++) {
			for(int j = i+1; j < r.length; j++) {
				for(int k = j+1; k < r.length; k++) {
					if (r[i]+r[j]+r[k] == 7) {
						return true;
					}
				}
			}
		}
		
		return false;
	  }
}
