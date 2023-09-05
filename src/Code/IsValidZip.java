package Code;

public class IsValidZip {
	public static boolean isValid(String zip) {
		if(zip.length() > 5) {
			return false;
		}
		for(char c : zip.toCharArray()) {
			if (Character.isDigit(c) == false){
				return false;
			}
		}
		return true;
	}
}
