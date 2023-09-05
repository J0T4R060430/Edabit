package Code;

public class _FlipArray {
	public static Object[] flipArray(Object[] arr) {
		if(arr instanceof Object[][]) {
			Object[] flipped = new Object[arr.length];
			for(int i = 0; i < arr.length; i ++) {
				flipped[i] = ((int[]) arr[i])[0];
			}
			return flipped;
		}else if(arr instanceof Object[]) {
			Object[][] flipped = new Object[arr.length][1];
			for(int i = 0; i < arr.length; i++) {
				flipped[i][0] = arr[i];
			}
			return flipped;
		}
		return new Object[] {};
	}
}
