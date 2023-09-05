package Code;

public class PiggyBank {
	  public static int NumberOfDays(int cost, int savings, int start) {
			cost -= savings;
			int days = 0;
			while (cost >= 0) {
				for(int i = 0; i < 7; i++) {
					cost -= (start + i);
					days ++;
					if(cost <= 0) return days;
				}
				start ++;
			}
			return days;
	  }
}
