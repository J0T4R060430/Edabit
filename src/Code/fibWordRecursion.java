package Code;

public class fibWordRecursion {
	public static String generateWord(int n) {
	    if (n < 2) {
	      return "invalid";
	    }
	    StringBuilder sb = new StringBuilder();
	    return generateFibonacci(n, "b", "a", sb);
	  }

	  private static String generateFibonacci(
	      int n, String prevMinusOne, String prevMinusTwo, StringBuilder sb) {
	    if (n == 0) {
	      return sb.toString().substring(0, sb.toString().length() - 2);
	    }
	    sb.append(prevMinusOne + ", ");
	    String temp = prevMinusOne;
	    prevMinusOne = prevMinusTwo;
	    prevMinusTwo = prevMinusTwo + temp;
	    return generateFibonacci(--n, prevMinusOne, prevMinusTwo, sb);
	  }
	
}
