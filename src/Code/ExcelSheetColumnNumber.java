package Code;

public class ExcelSheetColumnNumber {
		  public static int titleToNumber(String s) {
				int sum= 0;
				char[] c = s.toCharArray();
				for(int i = c.length; i> 0; i--){
					sum += ((int) c[i-1]-64)* (int) Math.pow(26,c.length-i);
				}
				return sum;
				}
		
}
