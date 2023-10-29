package Expert;

public class IsConsecutiveInt {
    public static boolean isConsecutive(String s) {
        for(int i = 1; i <= s.length()/2; i++){
            if(!(s.length() % i == 0)) continue;
            boolean check = true;
            int direction = Integer.parseInt(s.substring(0, i)) - Integer.parseInt(s.substring(i, 2 * i));
            if(Math.abs(direction) != 1) continue;
            for(int j = 1; j < s.length() / i - 1; j++){
                if(Integer.parseInt(s.substring(j*i, (j+1) * i)) - Integer.parseInt(s.substring((j+1) * i, (j+2) * i)) != direction){
                    check = false;
                    break;
                }
            }
            if(check) return true;
        }
        return false;
    }
}
