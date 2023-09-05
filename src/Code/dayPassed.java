package Code;

public class dayPassed {
	  public static int dayOfYear(String date) {
			int[] days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
			String[] date_ = date.split("/");
			int year = Integer.parseInt(date_[2]),month = Integer.parseInt(date_[0]),day = Integer.parseInt(date_[1]);
			if(year%400==0 || (year%4 == 0 && year%100 !=0)) {
				days[1]++;
			}
			int sum = 0;
			for(int i = 0; i < month-1; i++) {
				sum += days[i];
			}
			sum += day;
			return sum;
		}
}
