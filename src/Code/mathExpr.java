package Code;

public class mathExpr {
	public static boolean mathExpr(String expr) {
		String expr2 = expr.replaceAll(" |[0-9]|\\+|-|\\*|/|%", "");
		System.out.println(expr2);
		if (expr2.equals("")) {
			return true;
		}
		return false;
	  }
}
