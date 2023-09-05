package Code;

public class toCamelCase {
	public static String toCamelCase(String str) {
		StringBuilder camel = new StringBuilder(str);
		for (int i = 0; i < camel.length(); i++) {
			if (camel.charAt(i) == '-') {
				camel.setCharAt(i+1, Character.toUpperCase(camel.charAt(i+1)));
			}
		}
		return camel.toString().replaceAll("-","");
	}
	
}
