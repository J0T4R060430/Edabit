package Expert;

public class palindromDescendant {
    public static boolean palindromeDescendant(int num) {
        String strNum = num + "";
        while(strNum.length() >= 2){
            if(strNum.length() %2 == 1){
                return false;
            }
            if(isPalindrome(strNum)){
                return true;
            }
            String nextNum = "";
            for(int i = 0; i < strNum.length(); i+=2){
                nextNum += (((int) strNum.charAt(i) - 48) + ((int) strNum.charAt(i+1) - 48)) + "";
            }
            strNum = nextNum;
            System.out.println(strNum);
        }
        return false;
    }

    public static boolean isPalindrome(String num){
        for(int i = 0; i < (num.length() + 1) / 2; i++){
            if(num.charAt(i) != num.charAt(num.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
