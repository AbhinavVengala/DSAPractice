package Leetcode.Easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n+1)/2;
        int currentSum = 0;
        for(int num: nums) {
            currentSum += num;
        }
        return totalSum - currentSum;
    }
}
