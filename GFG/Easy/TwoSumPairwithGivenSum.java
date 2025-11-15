package GFG.Easy;

import java.util.HashSet;

public class TwoSumPairwithGivenSum {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> processedNumber = new HashSet<>();
        for(int i=0;i<=arr.length-1;i++) {
            int sub = target - arr[i];
            if(processedNumber.contains(sub)) {
                return true;
            } else {
                processedNumber.add(arr[i]);
            }
        }
        return false;
    }
}
