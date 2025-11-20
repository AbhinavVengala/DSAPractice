package Leetcode.Easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxSum = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                count++;
                if(count>maxSum) maxSum = count;
            }
            else count = 0;
        }
        if(maxSum>count) return maxSum; else return count;
    }
}
