package Code;

public class ReverseYoda {
	public static String reverseLegoYoda(String text) {
		String[] sentences = text.substring(0, text.length()-1).replaceAll("\\.", "+").split("\\+ ");
		for(int i = 0; i < sentences.length; i++) {
			sentences[i] = Character.toLowerCase(sentences[i].charAt(0)) + sentences[i].substring(1);
			String[] splitt = sentences[i].split(", ");
			sentences[i] = splitt[1] + " " + splitt[0];
			sentences[i] = Character.toUpperCase(sentences[i].charAt(0)) + sentences[i].substring(1);
		}
		String unYoda = String.join(". ", sentences);
		return unYoda.replaceAll(" i ", " I ") + ".";
	}
	
}
