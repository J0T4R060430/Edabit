package Code;

public class specialReverseString {
	public static String specialReverseString(String str) {
		String str_ = str.toLowerCase().replaceAll(" ", "");
		String str__ = "";
		for(int i = str_.length()-1; i >= 0; i--) {
			str__ += str_.charAt(i);
		}
		String str___ = ""; int i_ = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				str___ += " "; continue;
			}
			if(Character.isUpperCase(str.charAt(i))) {
				str___ += Character.toUpperCase(str__.charAt(i_));
			}else {
				str___+=str__.charAt(i_);
			}
			i_++;
		}
		return str___;
				
	}
}
