package Code;

public class BasicCalculator {
	public static Object basicCalculator(int a, char o, int b) {
		switch(o) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0) {
				return null;
			}
			return a / b;
		}
		return null;
	}
}
