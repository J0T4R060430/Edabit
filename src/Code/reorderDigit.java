package Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class reorderDigit {
//	public static int[] reorderDigits(int[] arr, String orderBy) {
//	char[][] arr2 = new char[arr.length][];
//	int[] arr3 = new int[arr.length];
//	for(int i = 0; i < arr.length; i++) {
//		arr2[i] = (arr[i] + "").toCharArray();			
//		int pos; char temp;
//        for (int j = 0; j < arr2[i].length; j++) { 
//            pos = i; 
//            for (int k = j+1; k < arr2[i].length; k++) {
//                if (arr2[i][j] < arr2[i][pos]) pos = j;                 //find the index of the minimum element
//            }
//            temp = arr2[i][pos]; arr2[i][pos] = arr2[i][j]; arr2[i][j] = temp; 
//        } 
//        arr3[i] = Integer.parseInt(arr2[i].toString());
//	}
//	 
//	return arr3;
//}
public static int[] reorderDigits(int[] arr, String orderBy) {
	int[] orderedArr = new int[arr.length];

	for (int i = 0; i < arr.length; i++) {

		if (orderBy.equals("asc")) {
			orderedArr[i] = sort(arr[i], "asc");
		} else if (orderBy.equals("desc")) {
			orderedArr[i] = sort(arr[i], "desc");
		} else {
			orderedArr[i] = arr[i];
		}
	}
	return orderedArr;
}

public static int sort(int n, String order) {
	String num = String.valueOf(n);
	String[] split = num.split("");
	List<String> list = new ArrayList<String>(Arrays.asList(split));

	if (order.equals("asc")) {
		Collections.sort(list);
	} else if (order.equals("desc")) {
		Collections.sort(list, Collections.reverseOrder());
	}

	int number = Integer.valueOf(list.stream().collect(Collectors.joining()));
	return number;
}
}
