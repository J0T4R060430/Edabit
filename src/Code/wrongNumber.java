package Code;

public class wrongNumber {
	public static int wrongNumber(int[][] m) {
		int c1 = m[3][0], c2 = m[3][1], c3 = m[3][2];
		int r1 = m[0][3], r2 = m[1][3], r3 = m[2][3];
		int total = m[3][3], c = c1+c2+c3, r = r1+r2+r3;
		//the wrong number is an element
		if((c == total) && (r == total)) {
			int wrongR = 0, wrongC = 0;
			for(int i = 0; i < 3; i++) {
				int sum = 0;
				for(int j = 0; j < 3; j++) {
					sum += m[i][j];
				}
				if(sum != m[i][3]) {
					wrongR = i;
					break;
				}
			}
			for(int j = 0; j < 3; j++) {
				int sum = 0;
				for(int i = 0; i < 3; i++) {
					sum += m[i][j];
				}
				if(sum != m[3][j]) {
					wrongC = j;
					break;
				}
			}
			int sum = m[wrongR][3];
			for(int i = 0; i < 3; i++) {
				if(i != wrongC) sum -= m[wrongR][i];
			}
			return sum;
		}else {
			//the wrong number is the total sum
			if(c == r && c != total) {
				//return the correct total sum: r or c
				return c;
			}
			//the wrong number is one of the sums
			else {
				if(c == total) {
					for(int i = 0; i < 3; i++) {
						int sum = 0;
						for(int j = 0; j < 3; j++) {
							sum += m[i][j];
						}
						if(sum != m[i][3]) {
							return sum;
						}
					}
				}else if (r == total) {
					for(int j = 0; j < 3; j++) {
						int sum = 0;
						for(int i = 0; i < 3; i++) {
							sum += m[i][j];
						}
						if(sum != m[3][j]) {
							return sum;
						}
					}
				}
			}
			return 0;
		}
	  }
}
