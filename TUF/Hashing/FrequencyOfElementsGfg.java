package TUF.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsGfg {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            int key = entry.getKey();
            int value = entry.getValue();
            pair.add(key);
            pair.add(value);
            ans.add(pair);
        }
        return ans;
    }
}
