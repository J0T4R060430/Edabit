package Code;

public class WordNest {
	  public static boolean validWordNest(String word, String nest) {
		int l = word.length(); int pos = -1;
		while(nest != "") {
			if(nest.length() < l) {
				return false;
			}else if (nest.length() == l) {
				return word.equals(nest);
			}
			pos = -1;
			for(int i = 0; i < nest.length() - l; i++) {
				if(nest.substring(i, i+l).equals(word)) {
					if(pos != -1) return false;
					pos = i;
				}
			}
			if(pos == -1) return false;
			nest = nest.substring(0, pos) + nest.substring(pos + l, nest.length());
			System.out.println(nest);
		}
		return true;
	  }
// below is a much better solution, using str.replace and .contain
//	  public static boolean validWordNest(String word, String nest) {
//			while (nest.contains(word)) {
//				String collapse = nest.replace(word, "");
//				if (nest.length() - collapse.length() > word.length()) {
//					return false;
//				}
//				nest = collapse;
//			}
//			return nest.isEmpty();
//	  }
}
