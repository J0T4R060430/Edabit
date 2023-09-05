package Code;

public class multiply {
	public static int multiply(int x, int y) {
		return multiply2(x,y,x);
	}
	public static int multiply2(int x, int y, int s) {
		if(y == 1) return s;
		else if (y == -1) return -s;
		s += x;
		if(y > 0) y--;
		else y++;
		return multiply2(x,y,s);
	}
}
