package Code;

public class PigLatin {
	public static String pigLatin(String str) {
		String punc = "";
		if(!Character.isAlphabetic(str.charAt(str.length()-1))) {
			punc = str.charAt(str.length()-1) + "";
		}
		str = str.replaceAll("[!?.,]", "");
		String[] words = str.split(" ");
		boolean[] upper = new boolean[words.length];
		int i = 0;
		for(String word : words) {
			upper[i] = Character.isUpperCase(word.charAt(0)); i++;
		}
		for(i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
			if(isVowel(words[i].charAt(0))) {
				words[i] += "way";
			}else {
				words[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
			}
			if(upper[i]) {
				words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
			}
		}
		return String.join(" ", words) + punc;
		
	}
	
	public static boolean isVowel(char sc) {
		return (sc == 'a' || sc == 'e' || sc == 'i' || sc == 'o' || sc == 'u');
	}
}
