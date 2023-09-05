package Code;

public class differenceCipher {
	public static int[] encrypt(String str) {
		int[] asciiValue = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			asciiValue[i] = (int) str.charAt(i);
		}
		int[] code = new int[asciiValue.length];
		code[0] = asciiValue[0];
		for(int i = 1; i < asciiValue.length; i++) {
			code[i] = asciiValue[i]-asciiValue[i-1];
		}
		return code;
	}

	public static String decrypt(int[] arr) {
		int[] asciiValue = new int[arr.length];
		asciiValue[0] = arr[0];
		for(int i = 1; i < arr.length; i++) {
			asciiValue[i] = asciiValue[i-1] + arr[i];
		}
		String word = "";
		for(int i : asciiValue) {
			word += (char) i;
		}
		return word;
	}
}
