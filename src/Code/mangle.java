package Code;

public class mangle {
	public static String mangle(String str) {
		String mangled = "";
		for(Character c : str.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				char temp = c == 'z' || c == 'Z' ? 'a':(char)((int) c + 1);
				if(Character.isUpperCase(c) || temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					mangled += Character.toUpperCase(temp);
				}else {
					mangled += temp;
				}
			}else {
				mangled += c;
			}
			
		}
		return mangled;
	}
}
