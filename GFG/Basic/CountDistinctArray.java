package GFG.Basic;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctArray {
    public int countDistinct(int arr[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int num: arr) {
            set.add(num);
        }
        return set.size();
    }
}
