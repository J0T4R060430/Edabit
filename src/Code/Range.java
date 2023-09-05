package Code;

public class Range {
	public static int[] reversibleInclusiveList(int start,int end) {
		if(start > end) {
			int[] range = new int[start-end+1];
			for(int i = start; i >= end; i--) {
				range[start-i] = i;
			}
			return range;
		}else {
			int[] range = new int[end-start+1];
			for(int i = start; i <= end; i++) {
				range[i-start] = i;
			}
			return range;
		}
		}
}
