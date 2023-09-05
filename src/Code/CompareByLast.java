package Code;
import java.util.*;

public class CompareByLast {
	
	public class Challenge {
		public static String[] sortContacts(String[] arr, String sortBy) {
			if(arr == null){
					arr = new String[0];
				return arr;
			}
			Arrays.sort(arr, (s1, s2) -> {
	            String l1 = s1.split(" ")[1];
	            String l2 = s2.split(" ")[1];
	            return (sortBy.equals("DESC") ? -1 : 1) * l1.compareTo(l2);
	        });
	        return arr;
		}
	}
}
