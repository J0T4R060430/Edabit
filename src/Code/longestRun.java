package Code;

public class longestRun {
	public static int longestRun(int[] arr) {
		int maxCon = 1; int currentCon = 1; boolean up = true;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1] + 1 && up) {
				currentCon ++;
			}else if (arr[i] == arr[i-1] - 1 && !up) {
				currentCon ++;
			}else if(arr[i] == arr[i-1] + 1) {
				maxCon = Math.max(maxCon, currentCon);
				currentCon = 2;
				up = true;
			}else if(arr[i] == arr[i-1] - 1) {
				maxCon = Math.max(maxCon, currentCon);
				currentCon = 2;
				up = false;
			}else {
				maxCon = Math.max(maxCon, currentCon);
				currentCon = 1;
			}
		}
		return Math.max(maxCon, currentCon);
	}
}
