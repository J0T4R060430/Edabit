package Expert;

import java.util.ArrayList;

public class JosephMutation {
    public static int whoGoesFree(int n, int k) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) arrList.add(i);
        int i = -1;
        while (arrList.size() != 1){
            i = (i + k) % arrList.size();
            arrList.remove(i);
            i = (i == 0) ? arrList.size() - 1 : i - 1;
        }
        return arrList.get(i);
    }
}
