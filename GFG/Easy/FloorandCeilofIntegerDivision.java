package GFG.Easy;

import java.util.ArrayList;

public class FloorandCeilofIntegerDivision {
    public ArrayList<Integer> divFloorCeil(int a, int b) {
        int d = a/b;
        ArrayList<Integer> arr=new ArrayList<>();
        int floor = d;
        if((a^b)<0 && (a%b)!=0) {
            floor = d-1;
        }
        arr.add(floor);
        int ceil = d;
        if((a^b)>0 && (a%b)!=0){
            ceil = d+1;
        }
        arr.add(ceil);
        return arr;
    }
}
