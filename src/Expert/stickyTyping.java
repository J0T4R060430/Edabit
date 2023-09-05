package Expert;

public class stickyTyping {
    public static boolean isLongPressed(String base, String typed) {
        while (base.length() > 0){
            char ch = base.charAt(0); int count = 0;
            while(base.length() > 0 && base.charAt(0) == ch){
                base = base.substring(1);
                count++;
            }
            while(typed.length() > 0 && typed.charAt(0) == ch){
                typed = typed.substring(1);
                count --;
            }
            if(count > 0) return false;
        }
        return typed.length() == 0;
    }
}
