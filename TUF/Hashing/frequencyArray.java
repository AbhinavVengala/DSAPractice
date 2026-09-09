package TUF.Hashing;

import java.util.HashMap;

public class frequencyArray {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer, Integer> hash = new HashMap<> ();
        int maxFreq = 0;
        int eleFreq = arr[0];
        for (int num: arr) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
        for (int num: arr) {
            if (hash.get(num) > maxFreq ||
                    (hash.get(num) == maxFreq && num > eleFreq)) {
                maxFreq = hash.get(num);
                eleFreq = num;
            }
        }
        return eleFreq;
    }
}
