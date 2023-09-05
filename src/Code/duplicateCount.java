package Code;

import java.util.ArrayList;

public class duplicateCount {
	public static int duplicateCount(String str) {
		ArrayList<Character> once = new ArrayList<Character>();
		ArrayList<Character> duplicate = new ArrayList<Character>();
		int counter = 0;
		for(char c : str.toCharArray()) {
			if(once.contains(c)) {
				if(duplicate.contains(c)) {
				}else {
					counter ++;
					duplicate.add(c);
				}
			}else {
				once.add(c);
			}
		}
		return counter;
	  }
}
