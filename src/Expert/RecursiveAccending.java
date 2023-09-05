package Expert;

import java.util.ArrayList;

public class RecursiveAccending {
    public static boolean ascending(String str) {
        for(int i = 1; i < str.length(); i++){
            if(isConsecutive(brokenUp(str,i))){
                return true;
            }
        }
        return false;
    }
    public static ArrayList<String> brokenUp(String s, int length){
        ArrayList<String> strlist = new ArrayList<>();
        for(int i = 0; i < s.length(); i += length){
            if(i + length >= s.length()) {
                strlist.add(s.substring(i));
                continue;
            }
            strlist.add(s.substring(i,i+length));
        }
        return strlist;
    }
    public static boolean isConsecutive(ArrayList<String> strlist){
        for(int i = 0; i < strlist.size()-1; i++){
            if(Long.parseLong(strlist.get(i)) > Long.parseLong(strlist.get(i+1))){
                return false;
            }
            else if(Math.abs(Long.parseLong(strlist.get(i+1)) - Long.parseLong(strlist.get(i))) != 1){
                return false;
            }
        }
        return true;
    }
}
