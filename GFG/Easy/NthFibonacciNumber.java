package GFG.Easy;

public class NthFibonacciNumber {
        public int nthFibonacci(int n) {
        // code here
        if(n<=0) return 0;
        if(n==1) return 1;
        int[] fibNum = new int[n+1];
        fibNum[0] = 0;
        fibNum[1] = 1;
        for(int i=2;i<=n;i++) {
            fibNum[i]=fibNum[i-1]+fibNum[i-2];
        }
        return fibNum[n];
    }
}
