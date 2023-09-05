package Code;

import java.util.ArrayList;

public class bonacci {
	public static long bonacci(int N, int k) {
		ArrayList<Long> bonacci = new ArrayList<Long>();
		for(int i = 0; i < N-1; i++) {
			bonacci.add(0L);
		}
		bonacci.add(1L);
		System.out.println(bonacci);
		for(int i = 0 ; i < k-N; i++) {
			long sum = 0;
			for(int j = 0; j < N; j++) {
				sum += bonacci.get(i+j);
			}
			bonacci.add(sum);
			System.out.println(bonacci);
		}
		return bonacci.get(k-1);
	  }
}
