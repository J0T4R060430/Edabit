package Expert;

public class HiddenInPlainSight {
    public static String baconify(String msg, String mask) {
        msg = msg.replaceAll("[^a-zA-z]", "").toLowerCase();
        String base2 = "";
        for(char c : msg.toCharArray()){
            System.out.println(Integer.toString(((int) c) - 97, 2));
            base2 += String.format("%5s", Integer.toString(((int) c) - 97, 2));
            System.out.println(base2);
        }
        int pos = 0,l = base2.length(); String ans = "";
        for(int i = 0; i < mask.length(); i++){
            if(pos < l && Character.isAlphabetic(mask.charAt(i))){
                if(base2.charAt(pos) == '1'){
                    ans += Character.toLowerCase(mask.charAt(i)) + "";
                }else{
                    ans += Character.toUpperCase(mask.charAt(i)) + "";
                }
                pos ++;
            }else{
                ans += mask.charAt(i);
            }
        }
        return ans;
    }
}
