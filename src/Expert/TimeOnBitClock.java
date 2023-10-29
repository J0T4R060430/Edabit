package Expert;

import java.util.HashMap;

public class TimeOnBitClock {
    public static String whatsTheTime(String bitmap) {
        HashMap<String, Integer> nums  = new HashMap<String, Integer>();
        nums.put("111101101101111", 0);
        nums.put("010110010010111", 1);
        nums.put("111001111100111", 2);
        nums.put("111001111001111", 3);
        nums.put("101101111001001", 4);
        nums.put("111100111001111", 5);
        nums.put("100100111101111", 6);
        nums.put("111001001001001", 7);
        nums.put("111101111101111", 8);
        nums.put("111101111001001", 9);
        String[] clock = bitmap.split("(?<=\\G.{17})");
        int i; String s; String time = "";
        for (i = 0; i < 17; i += 3) {
            System.out.println(i);
            s = clock[0].substring(i, i+3) +
                    clock[1].substring(i, i+3) +
                    clock[2].substring(i, i+3) +
                    clock[3].substring(i, i+3) +
                    clock[4].substring(i, i+3);
            System.out.println(s);
            time += nums.get(s);
            i++;
            if(i == 5) i+= 2;
        }
        return time.substring(0, 2) + ":" + time.substring(2, 4);
    }
}
