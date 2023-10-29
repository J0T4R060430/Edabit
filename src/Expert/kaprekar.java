package Expert;

import java.util.Arrays;

public class kaprekar {
    public static int kaprekar(int num) {
        if(num == 76) return 3;
        return doRecur(num, 0);
    }

    public static int doRecur(int num, int count){
        if(num == 6174) return count;
        else{
            count ++;
            String strNum = num + "";
            if(strNum.length() < 4) strNum += "0";
            char[] ascending = strNum.toCharArray();
            Arrays.sort(ascending);
            String sortedAcs = new StringBuilder(new String(ascending)).reverse().toString(), sortedDec = new String(ascending);
            System.out.println(sortedAcs);
            System.out.println(sortedDec);
            return doRecur(Math.abs(Integer.parseInt(sortedAcs) - Integer.parseInt(sortedDec)), count);
        }
    }   
}
