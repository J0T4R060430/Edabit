package Expert;

public class MaxRemoval {
    public class Challenge {
        public static int moves(String start) {
            return Math.max(maxMove(start, "intact", "actor"),
                    maxMove(start, "actor", "intact"));
        }
        public static int maxMove(String s, String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();
            int count = 0;
            int idx = s.indexOf(s1);
            while (idx != -1) {
                count++;
                s = s.substring(0,idx) + s.substring(idx+n1);
                idx = s.indexOf(s1);
            }
            idx = s.indexOf(s2);
            while (idx != -1) {
                count++;
                s = s.substring(0,idx) + s.substring(idx+n2);
                idx = s.indexOf(s2);
            }
            return count;
        }
    }
}
