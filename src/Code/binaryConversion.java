package Code;

import java.util.Arrays;

public class binaryConversion {
	public static String binaryConversion(String bin) {
		if (bin == "") return "";
		String[] binchar = bin.split("(?<=\\G.{8})");
		System.out.println(Arrays.asList(binchar).toString());
		String word = "";
		for(String s : binchar) {
			word += (char) Integer.parseInt(s,2);
		}
		System.out.println("here");
		return word;
		
	  }
}
