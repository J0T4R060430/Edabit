package Code;

public class matrixIncrement {
	public static int[][] increment(int r, int c, String[] lst) {
		int[][] m = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				m[i][j] = 0;
			}
		}
		for(String s : lst) {
			if(s.charAt(1) == 'r') {
				int i = Integer.parseInt(s.substring(0, 1));
				for(int j = 0; j < c; j++) {
					m[i][j] ++;
				}
			}else if(s.charAt(1) == 'c') {
				int j = Integer.parseInt(s.substring(0, 1));
				for(int i = 0; i < r; i++) {
					m[i][j] ++;
				}
			}
		}
		return m;
	}
}
