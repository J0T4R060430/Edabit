package Code;

public class xPronounce {
	public static String xPronounce(String sentence) {
		sentence = sentence.replaceAll(" x ", " ecks ");
		sentence = sentence.replaceAll("^x ", "ecks ");
		sentence = sentence.replaceAll(" x", "z");
		sentence = sentence.replaceAll("x","cks");
		return sentence;
	}
}
