package Code;

public class bitRotate {
	public static int bitRotate(int n, int m, boolean d) {
		String n2 = Integer.toBinaryString(n);
		if(d) {
			m %= n2.length();
			System.out.println(n2);
			n2 = n2.substring(n2.length()-m) + n2.substring(0,n2.length()-m);
			System.out.println(n2);
			return Integer.parseInt(n2, 2);
		}else {
			m %= n2.length();
			System.out.println(n2);
			n2 = n2.substring(m) + n2.substring(0, m);
			System.out.println(n2);
			return Integer.parseInt(n2, 2);
		}
	  }
}
