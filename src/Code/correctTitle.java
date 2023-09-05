package Code;

public class correctTitle {
	public static String correctTitle(String str) {
		String[] words = str.split(" ");
		String[] correct = new String[words.length];
		for(int i = 0; i < words.length; i++) {
			String temp = words[i].toLowerCase();
			System.out.println(temp);
			if(temp.equals("and") || temp.equals("in") || temp.equals("the") || temp.equals("of")) {
				correct[i] = temp;
			}else {
				correct[i] = Character.toUpperCase(temp.charAt(0)) + temp.substring(1);
			}
		}
		return String.join(" ", correct);
	}
}
