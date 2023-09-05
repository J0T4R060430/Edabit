package Code;

public class IndexFilter {
	public static String indexFilter(int[] idx, String str) {
		int l = str.length(); String filtered = "";
		for(int i = 0; i < idx.length; i++) {
			if (idx[i] < 0) {
				idx[i] += l;
			}
			filtered += str.charAt(idx[i]);
		}
		return filtered.toLowerCase();
		
	}	
}
