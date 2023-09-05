package Code;

public class paulCipher {
	public static String paulCipher(String txt) {
		txt = txt.toLowerCase();
		String cipher = "";
		int shift = 0;
		for(char c : txt.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				int ascii = (int) c - 96;
				ascii = (ascii + shift)%26;
				cipher += (char) (ascii + 96);
				shift = (int) c - 96;
				System.out.println(shift);
			}else {
				cipher += c;
			}
		}
		return cipher.toUpperCase();
	  }
}
