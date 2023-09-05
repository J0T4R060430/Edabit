package Code;

public class PyramidBuilder {
	public static String pyramid(int height) {
		  String[] pyramid = new String[height];
		  for(int i = 0; i < height; i++) {
			  int slashes = 4*(height-i-1), stars = 4*i * 2;
			  String layer = "";
			  for(int j = 0; j < slashes; j++) layer += "/";
			  for(int j = 0; j < stars; j++) layer += "*";
			  for(int j = 0; j < slashes; j++) layer += "\\";
			  pyramid[i] = layer;
		  }
		  return String.join("\n", pyramid);
	  }
}
