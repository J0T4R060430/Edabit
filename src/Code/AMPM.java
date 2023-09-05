package Code;

public class AMPM {
	public static String convertTime(String s) {
		if(s.substring(s.length()-2, s.length()).equals("AM")) {
			if(s.substring(0, 2).equals("12")) {
				return "00" + s.substring(2,s.length()-2);
			}else {
				return s.substring(0, s.length()-2);
			}
		}else {
			if(s.substring(0, 2).equals("12")) {
				return s.substring(0, s.length()-2);
			}else {
				return Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2,s.length()-2);
			}
		}
	  }
}
