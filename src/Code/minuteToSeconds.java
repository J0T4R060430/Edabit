package Code;

public class minuteToSeconds {
	public static int minutesToSeconds(String tm) {
		String[] t = tm.split(":");
		int m = Integer.parseInt(t[0]);
		int s = Integer.parseInt(t[1]);
		if (s > 59) return -1;
		return m * 60 + s;
	}
}
