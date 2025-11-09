package GFG.Basic;

public class FirstnFibonacci {
        public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] num = new int[n];
        if(n>=1) num[0] = 0; 
        if(n>=2) num[1] = 1;
        for(int i=2;i<n;i++) {
            num[i] = num[i-1] + num[i-2];
        }
        return num;
    }
}
