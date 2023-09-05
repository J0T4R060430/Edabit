package Code;

public class PeelLayer {
	public static Object[][] peelLayer(Object[][] arr) {
		if (arr.length == 2 && arr[0].length == 2) return new Object[0][0];
		Object[][] peeled = new Object[arr.length-2][arr[0].length-2];
		for(int i = 1; i < arr.length-1; i++) {
			for(int j = 1; j < arr[0].length-1; j++) {
				peeled[i-1][j-1] = arr[i][j];
			}
		}
		return peeled;
	}
}
