package Code;

public class chessKnight {
	public static boolean cannotCapture(int[][] b) {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(b[i][j] == 1) {
					if(inBound(i + 1, j + 2) && b[i+1][j+2] == 1) return false;
					if(inBound(i + 2, j + 1) && b[i+2][j+1] == 1) return false;
					if(inBound(i + -1, j + 2) && b[i+-1][j+2] == 1) return false;
					if(inBound(i + -2, j + 1) && b[i+-2][j+1] == 1) return false;
					if(inBound(i + 1, j + -2) && b[i+1][j+-2] == 1) return false;
					if(inBound(i + 2, j + -1) && b[i+2][j+-1] == 1) return false;
					if(inBound(i + -1, j + -2) && b[i+-1][j+-2] == 1) return false;
					if(inBound(i + -2, j + -1) && b[i+-2][j+-1] == 1) return false;
					
				}
			}
		}
		return true;
	  }
	
	public static boolean inBound(int i, int j) {
		return (0 <= i && i < 8) && (0 <= j && j <8);
	}
}
