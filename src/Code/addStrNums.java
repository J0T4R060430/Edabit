package Code;

public class addStrNums {
	public static String addStrNums(String num1, String num2) {
		 if(num1.length() - num1.replaceAll("[^0-9]", "").length() > 0) {
			 return "-1";
		 }
		 if(num2.length() - num2.replaceAll("[^0-9]", "").length() > 0) {
			 return "-1";
		 }
		 //make the strings equal length
		 int l1 = num1.length(), l2 = num2.length(), carry = 0;
		 int l = Math.max(l1, l2);
		 StringBuilder n1 = new StringBuilder(num1);
		 StringBuilder n2 = new StringBuilder(num2);
		 while(n1.length() < l) {
			 n1.insert(0, "0");
		 }num1 = n1.toString();
		 while(n2.length() < l) {
			 n2.insert(0, "0");
		 }num2 = n2.toString();
		 StringBuilder sum = new StringBuilder();
		 for(int i = l-1; i >=0; i--) {
			 int d1 = Character.getNumericValue(num1.charAt(i)); 
			 int d2 = Character.getNumericValue(num2.charAt(i));
			 System.out.println(d1 + " " + d2);
			 if(d1 + d2 + carry > 9) {
				 sum.insert(0,((d1 + d2 + carry) + "").charAt(1));
				 carry = 1;
			 }else {
				 sum.insert(0,(d1 + d2 + carry) + "");
				 carry = 0;
			 }
		 }
		 if(carry == 1) {
			 sum.insert(0, "1");
		 }
		 String s = sum.toString();
		 for(int i = 0; i < s.length(); i++) {
			 if(s.charAt(i) != '0') {
				 return s.substring(i);
			 }
		 }
		 return "";
	}
}
