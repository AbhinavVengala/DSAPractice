package Leetcode.Easy;

public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int left=0;
        int[] ans = new int[nums.length];
        for(int i=0;i<n;i++) {
            ans[left] = nums[i];
            ans[left+1] = nums[i+n];
            left = left + 2;
        }
        return ans;
    }
}
