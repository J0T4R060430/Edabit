package Code;

import java.math.BigInteger;

public class lookAndSay {
	  public static BigInteger lookAndSay(long n) {
		  String look = n + "", say = "";
		  if(look.length() % 2 == 1) return BigInteger.valueOf(-1);
		  while(look.length() > 0) {
			  for(int i = 0; i < (int) look.charAt(0) - 48; i++) {
				  say += look.charAt(1);
			  }
			  look = look.substring(2);
		  }
		 return new BigInteger(say);
	  }
}
