package Udemy_Practice.AbdulBariDSA.Recursion;

public class Fibonacci {
    static int[] A;

    static int fib(int n) {
        if(n<=1) return n;
        return fib(n-2)+fib(n-1);
    }

    static int fib1(int n) {
        int s=0, t0=0, t1=1;
        if(n<=1) return n;
        for (int i = 2; i <= n; i++) {
            s=t0+t1;
            t0=t1;
            t1 =s;
        }
        return t1;
    }

    static int mfib(int n) { // Memoization function
        if(n<=1) {
            A[n] = n;
            return n;
        } else {
            if(A[n-2] == -1)
                A[n-2] = mfib(n-2);
            if(A[n-1] == -1)
                A[n-1] = mfib(n-1);
            A[n] = A[n-2]+A[n-1];
            return A[n-2]+A[n-1];
        }
    }

    public static void main(String[] args) {
        int n = 5;
        A = new int[n+1];
        for (int i = 0; i <= n; i++)
            A[i] = -1;
        System.out.println(mfib(n));
    }
}
