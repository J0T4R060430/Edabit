package Code;

import java.util.Arrays;

public class sentencePrimeness {
	public static String sentencePrimeness(String sentence) {
		sentence = sentence.replaceAll("[^A-Za-z0-9 ]", "");
		String[] words = sentence.split("[ ]+");
		System.out.println(Arrays.toString(words));
		int[] wordValues = new int[words.length];
		int totalSum = 0;
		for(int i = 0; i < words.length; i++) {
			int sum = 0;
			for(char c : words[i].toLowerCase().toCharArray()) {
				if(Character.isAlphabetic(c)) {
					sum += ((int) c) - 96;
				}else {
					sum += ((int) c) - 48;
				}
			}
			wordValues[i] = sum;
			totalSum += sum;
		}
		System.out.println(Arrays.toString(wordValues));
		
		if(isPrime(totalSum)) {
			return "Prime Sentence";
		}
		for(int i = 0; i < words.length; i++) {
			if(isPrime(totalSum - wordValues[i])) {
				return "Almost Prime Sentence (" + words[i] + ")";
			}
		}
		
		
		return "Composite Sentence";
	}
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i <= Math.pow(n, 0.5); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
