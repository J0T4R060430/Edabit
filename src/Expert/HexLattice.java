package Expert;

public class HexLattice {
    public static String hexLattice(int n) {
        int sum = 1; int s = 1;
        while(sum < n){
            sum += 6 * s;
            s ++;
        }
        if(sum == n){
            int l = 4 * s - 4; String temp = "";
            String[] a = new String[s * 2 - 1];
            for(int i = 0; i < s; i++){
                temp = "";
                for(int j = 1; j < s-i; j++) temp += " ";
                for(int j = s; j < 2 * s + i; j++) temp += " o";
                for(int j = 0; j < s-i; j++) temp += " ";
                a[i] = temp;
            }
            for(int i = s; i < 2 * s; i++){
                a[i-1] = a[2 * s - i - 1];
            }
            return String.join("\n", a);
        }else{
            return "Invalid";
        }
    }
}
