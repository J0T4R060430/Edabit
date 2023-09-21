package Expert;

public class IntersectingLines {
    public static boolean intersection(int[][] p) {
        double s1, s2, b1, b2;
        if(p[1][0] == p[0][0]){
            s1 = Integer.MAX_VALUE; b1 = p[1][0];
        }else{
            s1 = (double) (p[1][1] - p[0][1]) / (p[1][0] - p[0][0]);
            b1 = p[0][1] - p[0][0] * s1;
        }
        if(p[3][0] == p[2][0]){
            s2 = Integer.MAX_VALUE; b2 = p[2][0];
        }else{
            s2 = (double) (p[3][1] - p[2][1]) / (p[3][0] - p[2][0]);
            b2 = p[2][1] - p[2][0] * s2;
        }
        //calculate the equations of the two lines
        System.out.println(s1 + "   " + b1);
        System.out.println(s2 + "   " + b2);


        if(s1 == Integer.MAX_VALUE && s2 == Integer.MAX_VALUE){
            if(b1 == b2){
                return (Math.max(p[0][1], p[1][1]) >= Math.min(p[2][1], p[3][1]) && Math.min(p[0][1], p[1][1]) <= Math.min(p[2][1], p[3][1])) ||
                        (Math.max(p[2][1], p[3][1]) >= Math.min(p[1][1], p[0][1]) && Math.min(p[2][1], p[3][1]) <= Math.min(p[1][1], p[0][1])) ||
                        (Math.max(p[0][1], p[1][1]) - Math.max(p[2][1], p[3][1]) >= 0 && Math.min(p[0][1], p[1][1]) - Math.min(p[2][1], p[3][1]) <= 0) ||
                        (Math.max(p[0][1], p[1][1]) - Math.max(p[2][1], p[3][1]) <= 0 && Math.min(p[0][1], p[1][1]) - Math.min(p[2][1], p[3][1]) >= 0);
            }
            return false;
        }else if(s1 == Integer.MAX_VALUE){
            return (p[2][0] <= b1 && b1 <= p[3][0]) || (p[2][0] >= b1 && b1 >= p[3][0]);
        }else if(s2 == Integer.MAX_VALUE){
            return (p[0][0] <= b2 && b2 <= p[1][0]) || (p[0][0] >= b2 && b2 >= p[1][0]);
        }

        //calculate intersect point
        double x =  (b1 - b2) / (s2 - s1);
        double y =  s1 * x + b1;

        System.out.println(x);
        System.out.println(y);


        if((p[0][0] <= x && x <= p[1][0]) || (p[0][0] >= x && x >= p[1][0])){
            System.out.println("1");
            if((p[2][0] <= x && x <= p[3][0]) || (p[2][0] >= x && x >= p[3][0])){
                System.out.println("1");
                if((p[0][1] <= y && y <= p[1][1]) || (p[0][1] >= x && x >= p[1][1])){
                    System.out.println("1");
                    if((p[2][1] <= x && x <= p[3][1]) || (p[2][1] >= x && x >= p[3][1])){
                        System.out.println("1");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
