package Unfinished;

import java.util.ArrayList;

public class Unfinished_IsVampire {
    public static String isVampire(int n) {
        String strn = n + "";
        if((strn).length()  < 3) return "Normal Number";
        else {
            if(strn.length() % 2 == 0){

            }else{

            }
        }
        return "";
    }

    public static ArrayList<String> getAllPermu(String s){
        ArrayList<String> all = new ArrayList<String>();
        int accessCounter = 0;
        for(char c : s.toCharArray()) all.add(c + "");
        for(int i = 1; i < s.length(); i++){
            for(int j = 0; j < Math.pow(s.length(), i); j++){
                for(int k = 0; k < s.length(); k++){
                    all.add(all.get(j + accessCounter) + s.charAt(k));
                }
            }
            accessCounter += (int) Math.pow(s.length(), i);
            System.out.println(accessCounter);
        }
        return all;
    }
}
