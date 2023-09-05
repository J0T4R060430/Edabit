package Code;

public class boxVolume {
	public static int totalVolume(int[][] part) {
		int volume = 0;
		for (int[] box : part) {
			volume += box[0]*box[1]*box[2];
		}
		return volume;
	}
}
