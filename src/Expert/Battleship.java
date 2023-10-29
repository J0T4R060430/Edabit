package Expert;

/*
CHARACTERS SET
○    ➞ blank
●    ➞ ship
☼    ➞ miss
☀   ➞ hit
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Battleship {

    private int score = 0, cruiserDown = 0, hits = 0;
    private int[][] scheme = new int[9][2];
    private int[][] target = new int[6][2];
    private String[][] map = new String[5][5];
//    private int[][][] cruiser = new int[3][2][2];
//    private char[] colCoord = new char[] {'A', 'B', 'C', 'D', 'E'}, rowCoord = new char[] {'1', '2', '3', '4', '5'};


    public Battleship(String[] scheme, String[] target) {
        for(int i = 0; i < 9; i ++){
            this.scheme[i] = new int[] {(int) scheme[i].charAt(0) - 65,
                    Integer.parseInt(scheme[i].substring(1))-1};
        }
        for(int i = 0; i < 6; i++){
            this.target[i] = new int[] {(int) target[i].charAt(0) - 65,
                    Integer.parseInt(target[i].substring(1))-1};

        }
//        int pos = 0;
        List<int[]> schemeList = Arrays.asList(this.scheme);
        for(int[] i : schemeList){ System.out.println(Arrays.toString(i));}
        List<int[]> targetList = Arrays.asList(this.target);
        System.out.println("------------");
        for(int[] i : targetList){ System.out.println(Arrays.toString(i));}

//        for(int i = 0; i < 8; i++){
//            if((Math.abs(this.scheme[i][0] - this.scheme[i+1][0]) == 1 && this.scheme[i][1] == this.scheme[i+1][1])||
//                    (Math.abs(this.scheme[i][1] - this.scheme[i+1][1]) == 1 && this.scheme[i][0] == this.scheme[i+1][0])){
//                cruiser[pos] = new int[][] {this.scheme[i], this.scheme[i+1]};
//                pos++;
//            }
//        }

        for(int i = 0; i < 6; i++){
            System.out.println(Arrays.toString(targetList.get(i)));
            if(schemeList.contains(targetList.get(i))){
                System.out.println("here");
                this.score ++;
                this.hits ++;
            }
        }

        //check for cruiser hits
        for(int i = 0; i < 5; i++){
            if(schemeList.contains(this.target[i]) && schemeList.contains(this.target[i+1])){
                if((Math.abs(this.target[i][0] - this.target[i+1][0]) == 1 && this.target[i][1] == this.target[i+1][1])||
                        (Math.abs(this.target[i][1] - this.target[i+1][1]) == 1 && this.target[i][0] == this.target[i+1][0])){
                    this.score += 2;
                    this.cruiserDown ++;
                }
            }
        }

        //construct map
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                int[] point = new int[] {i, j};
                if(targetList.contains(point) && schemeList.contains(point)){
                    map[i][j] = "☀";
                }else if(targetList.contains(point)){
                    map[i][j] = "☼";
                }else if(schemeList.contains(point)){
                    map[i][j] = "●";
                }else{
                    map[i][j] = "○";
                }
            }
        }

    }
    public String[][] board() {
        return this.map;
    }
    public int hits() {
        return this.hits;
    }
    public int sunk() {
        return this.cruiserDown;
    }
    public int points() {
        return this.score;
    }

    public static void main(String[] args){
        Battleship bt = new Battleship(new String[] {"A1", "C1", "B2", "B3", "D2", "E2", "E4", "E5", "A5"}, new String[] {"A1", "B2", "C3", "D4", "E5", "E4"});
        System.out.println(bt.board());
    }
}


