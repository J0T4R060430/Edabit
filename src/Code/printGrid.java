package Code;

public class printGrid {
	public static String printGrid(int rows, int cols) {
		String[][] m = new String[rows][cols];
		for(int i = 0; i < cols; i++) {
			for(int j = 0; j < rows; j++) {
				m[j][i] = i*rows + j + 1 + "";
			}
		}
		String[] m2 = new String[rows];
		for(int i = 0; i < rows; i++) {
			m2[i] = String.join(", ", m[i]);
		}
		return String.join("\n", m2);
	}
}
