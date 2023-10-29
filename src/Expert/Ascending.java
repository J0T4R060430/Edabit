package Expert;

public class Ascending {
    public static boolean ascending(String s) {
        for(int i = 1; i <= s.length()/2; i++){
            if(!(s.length() % i == 0)) continue;
            boolean check = true;
            for(int j = 0; j < s.length() / i - 1; j++){
                if(Integer.parseInt(s.substring(j*i, (j+1) * i)) - Integer.parseInt(s.substring((j+1) * i, (j+2) * i)) != -1){
                    check = false;
                    break;
                }
            }
            if(check) return true;
        }
        return false;
    }
}
