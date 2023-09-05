package Code;

import java.util.HashMap;
import java.util.Map;

public class InsuranceList {
		public static Map<String,Integer> convertToNumber(Map<String,String> list) {
			HashMap<String, Integer> l2 = new HashMap<>();
			for (String key:list.keySet()) {
				l2.put(key, Integer.parseInt(list.get(key)));
			}
			return l2;
		}
	
}
