package GFG.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i: arr){
            if(!seen.add(i))
                duplicates.add(i);
        }
        return new ArrayList<>(duplicates);
    }
}
