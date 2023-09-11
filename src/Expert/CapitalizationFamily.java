package Expert;

import java.util.*;


public class CapitalizationFamily {
    public static Map<Integer, List<String> > grouping(String[] w) {
        List<String> baseList = new ArrayList<>();
        Map<Integer, List<String>> map = new HashMap<>();
        for(String eachStr: w) {
            int numOfUpper = numberOfUpperCase(eachStr);
            if(map.containsKey(numOfUpper)) {
                List<String> strList = map.get(numOfUpper);
                strList.add(eachStr);
                map.put(numOfUpper, strList);
            }
            else {
                baseList.add(eachStr);
                List<String> cloneList = new ArrayList<>(baseList);
                map.put(numOfUpper, cloneList);
                baseList.clear();
            }
        }
        return map;
    }

    public static int numberOfUpperCase(String word) {
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}