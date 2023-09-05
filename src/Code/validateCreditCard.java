package Code;

public class validateCreditCard {
	  public static boolean validateCard(long num) {
		if((num + "").length() < 14 || (num + "").length() > 19) return false;
		int checkNum = (int) (num%10);
		num /= 10; int sum = 0; boolean doubles = true;
		StringBuilder strNum = new StringBuilder(num + "");
		strNum = strNum.reverse();
		for(char c : strNum.toString().toCharArray()) {
			if(doubles) {
				doubles = false;
				int doubled = ((int) c - 48) * 2;
			if(doubled > 9) sum += doubled%10 + 1;
			else sum += doubled;
			}else {
				doubles = true;
				sum += (int) c - 48;
			}
		}
		return 10 - sum%10 == checkNum;
	  }
}
