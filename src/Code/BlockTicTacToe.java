package Code;

public class BlockTicTacToe {
	public static int blockPlayer(int a, int b) {
		String[] w = new String[] {"012", "345", "678", "036", "147", "258", "048", "246"};
		for(String s : w) {
			if(s.contains(a + "") && s.contains(b + "")) {
				System.out.println(s);
				for(int i = 0; i < 3; i++) {
					String ss = s.substring(i, i+1);
					if(!ss.equals(a + "") && !ss.equals(b + "")) {
						return Integer.parseInt(ss);
					}
				}
			}
		}
		return 0;
	}
}
