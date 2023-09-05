package Code;

public class SpartanCipher {
	  public static String cipher(String message, int nSlide) {
			int length = message.length(); int width;
			if(length % nSlide != 0) {
				width = length / nSlide + 1;
			}else {
				width = length / nSlide;
			}
			while(message.length() < width * nSlide) {
				message += " ";
			}
			String[][] scroll= new String[nSlide][width];
			for(int i = 0; i < nSlide; i++) {
				for(int j = 0; j < width; j++) {
					scroll[i][j] = message.charAt(i*width + j) + "";
				}
			}
			String cipherd = "";
			for(int j = 0; j < width; j++) {
				for(int i = 0; i < nSlide; i++) {
					cipherd += scroll[i][j];
				}
			}
			while(cipherd.charAt(cipherd.length()-1) == ' ') {
				cipherd = cipherd.substring(0, cipherd.length()-1);
			}
			return cipherd;
		}
}
