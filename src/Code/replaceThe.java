package Code;

public class replaceThe {
	public static String replaceThe(String str) {
		str = str.replaceAll("the a", "an ");
		str = str.replaceAll("the e", "an ");
		str = str.replaceAll("the i", "an ");
		str = str.replaceAll("the o", "an ");
		str = str.replaceAll("the u", "an ");
		str = str.replaceAll("the ", "a ");
		return str;
	}

}
