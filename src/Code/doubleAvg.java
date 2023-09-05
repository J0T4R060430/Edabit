package Code;

public class doubleAvg {
	public static double mean(int[] nums) {
		double sum = 0;
		for (int i: nums) {
			sum += i;
		}
		double avg = sum / nums.length;
		String stringAvg = String.format("%.2f", avg);
		return Double.parseDouble(stringAvg);
	}
}
