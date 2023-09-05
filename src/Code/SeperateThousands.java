package Code;
public class SeperateThousands {
	public static String formatNum(int num) {
		String strnum = "" + num;
		int counter = 3;

		for(int i = strnum.length()-1; i > -1; i--) {
			counter --;
			if (counter == 0) {
				strnum = strnum.substring(0, i) + "," + strnum.substring(i);
				counter = 3;
			}
		}
		return strnum;
	}
}