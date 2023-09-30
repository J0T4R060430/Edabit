package Expert;

public class IsWordCahin {
    public static boolean isWordChain(String[] words) {
        for(int i = 0; i < words.length-1; i++){
            String cw = words[i], nw = words[i+1];
            if(cw.length() == nw.length()){
                int count = 0;
                for(int j = 0; j < cw.length(); j++){
                    if(cw.charAt(j) != nw.charAt(j)){
                        count ++;
                    }
                }if(count != 1){
                    System.out.println("1" + cw);
                    return false;
                }
            }else if(cw.length() == nw.length() + 1){
                String w = cw;
                for(char c : nw.toCharArray()){
                    w = w.replaceFirst(c + "", "");
                }
                System.out.println(w);
                if(w.length() != 1){
                    System.out.println("2");
                    return false;
                }
            }else if(cw.length() == nw.length() -1 ){
                String w = nw;
                for(char c : cw.toCharArray()){
                    w = w.replaceFirst(c + "", "");
                }
                System.out.println(w);
                if(w.length() != 1){
                    System.out.println("3");
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
