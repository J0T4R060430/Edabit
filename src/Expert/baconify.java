package Expert;

public class baconify {
    public static String baconify(String msg) {
        msg = msg.replaceAll("[^a-zA-Z]", "");
        String w = "";
        String[] words = new String[(int) msg.length()/5];
        for(int i = 0; i < words.length; i++){
            words[i] = msg.substring(i*5, i*5+5);
        }
        for(String word : words){
            System.out.println(word);
            String base2 = "";
            for(char c : word.toCharArray()){
                base2 += (Character.isUpperCase(c)) ? "0" : "1";
            }
            System.out.println(Integer.parseInt(base2, 2));
            w += ((char) (Integer.parseInt(base2, 2) + 97)) + "";
        }
        return w;
    }
}
