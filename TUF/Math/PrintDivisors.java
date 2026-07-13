package TUF.Math;

import java.util.ArrayList;
import java.util.Collections;

// GFG
public class PrintDivisors {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                ans.add(i);
                if(n/i!=i) {
                    ans.add(n/i) ;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
