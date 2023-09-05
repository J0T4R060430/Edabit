package Code;

public class totalPoints {
	public static int totalPoints(String[] guesses, String word) {
		int points = 0;
		for(String guess: guesses) {
			if(canCreate(guess, word)) {
				points += guess.length()-2;
				if(guess.length() == 6) points += 50;
			}
		}
		return points;
	}
	
	public static boolean canCreate(String s, String word) {
		for(char c : s.toCharArray()) {
			if(word.contains(c + "")) {
				int i = word.indexOf(c);
				word = word.substring(0,i) + word.substring(i+1);
			}else {
				return false;
			}
		}
		return true;
	}
}
