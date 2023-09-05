package Code;

public class isValidIP {
	public static boolean isValidIP(String str) {
		if(str == ""||str.charAt(str.length()-1) == ' ') return false;
		String[] lst = str.split("\\.");
		if(lst.length != 4) {
			System.out.println(lst.length);return false;
		}
		for(String s : lst) {
			System.out.println(s.replaceAll("[1-9][0-9][1-9]|[1-9]{1,2}", ""));
			if(s.replaceAll("[1-9][0-9][1-9]|[1-9]{1,2}", "").length() != 0) {
				return false;
			}else if(Integer.parseInt(s) > 255) {
				System.out.println("2b1g");return false;
			}
		}
		return true;		
	  }
}
