package Expert;

public class MultiplyBy11 {
    public static String multiplyBy11(String a) {
        String b=a+"0";
        a="0"+a;
        int r=0;
        String o="";
        for (int i=a.length()-1; i>=0; i--) {
            int c=Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"")+r;
            r=c/10;
            if (c>9) c=c%10;
            o=c+o;
        }
        return (r!=0 ? r : "") + o;
    }
}
