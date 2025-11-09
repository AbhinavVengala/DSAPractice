// Problem: Fibonacci Number
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/fibonacci-number/description/

public class FibonacciNumber {
        public int fib(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        int[] fibNum = new int[n];
        fibNum[0] = 0;
        fibNum[1] = 1;
        int sum = fibNum[0]+fibNum[1];
        for (int i = 2; i < n; i++) {
            fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
            sum = fibNum[i]+fibNum[i-1];
        }
        return sum;
    }
}
