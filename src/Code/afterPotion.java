package Code;

public class afterPotion {
	public static String afterPotion(String str) {
		String[] growth = new String[] {"0","1","2","3","4","5","6","7","8","9","10"};
		String[] shrink = new String[] {"!","9","8","7","6","5","4","3","2","1","0"};
		for(int i = 0; i < 10; i++) {
			str = str.replaceAll(growth[i]+"A", growth[i+1]);
			str = str.replaceAll(shrink[i]+"B", shrink[i+1]);
		}
		return str;
	}
}
