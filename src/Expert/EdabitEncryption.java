package Expert;

public class EdabitEncryption {
    public static String encryption(String s) {
        s = s.replaceAll(" ", "");
        int rows = (int) Math.sqrt(s.length());
        int cols = (s.length() - 1) / rows + 1;
        while(cols > rows + 1){
            rows ++; cols = (s.length() - 1) / rows + 1;
        }
        System.out.println(rows + "        " + cols + "    " + s.length());
        for(int i = 0; i < rows * cols - s.length(); i += 0) s += "_";
        System.out.println(s.length());
        String encrypted = "";
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                encrypted += s.charAt(j * cols + i);
            }
            encrypted += " ";
        }
        return encrypted.replaceAll("_", "").trim();
    }
}
