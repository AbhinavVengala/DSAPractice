package Leetcode.Easy;
// LeetCode: Two Sum (Easy)
// Link: https://leetcode.com/problems/two-sum/

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // The problem statement guarantees that exactly one solution exists.
        // Throwing an exception is a good practice for "unreachable" code
        // to signal that the input assumptions were violated.
        throw new IllegalArgumentException("No two sum solution found");
    }

    /**
     * Main method for local testing.
     */
    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solver.twoSum(nums, target);

        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result)); // Expected: [0, 1]
    }
}
