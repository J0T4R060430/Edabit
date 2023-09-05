package Expert;

import java.util.Arrays;

public class VegasDice {
	public static int diceRoll(int n, int outcome) {
		int[] cRoll = new int[n], endRoll = new int[n];
		Arrays.fill(cRoll, 1); Arrays.fill(endRoll, 6);
		int count = 0; int countDown = (int) Math.pow(6, n);
		while(countDown >= 0) {
			if(arraySum(cRoll) == outcome) count ++;
			cRoll = nextRoll(cRoll);
			countDown --;
		}
		return count;
	  }
	
	public static int[] nextRoll(int[] cRoll) {
		cRoll[0] += 1;
		for(int i = 0; i < cRoll.length; i++) {
			if(cRoll[i] == 7) {
				try {
					cRoll[i+1] += 1;
					cRoll[i] = 1;
				} catch(Exception e) {
					
				}
				
			}
		}
		return cRoll;
	}
	
	public static int arraySum(int[] arr) {
		int count = 0;
		for(int i : arr){count += i;}
		return count;
	}
}
