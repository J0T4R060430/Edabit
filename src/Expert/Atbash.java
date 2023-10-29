package Expert;

public class Atbash {
    public static String atbash(String str) {
        String atbached = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                atbached += (char)(155 - (int) c);
            }else if(Character.isLowerCase(c)){
                atbached += (char)(219 - (int) c);
            }else{
                atbached += c;
            }
        }
        return atbached;
    }
}
