package UsefulAlgorithems;

public class isPalindrome
{
    public static boolean isPalindrome(String num){
        for(int i = 0; i < (num.length() + 1) / 2; i++){
            if(num.charAt(i) != num.charAt(num.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
