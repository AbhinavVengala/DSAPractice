package Udemy_Practice.AbdulBariDSA.Recursion;

public class Power {
    static int power(int m, int n) {
        if(n == 0) return 1;
        return power(m, n-1) * m;
    }

    static  int power1(int m, int n) {
        if(n==0) return 1;
        if(n%2==0)
            return power1(m*m, n/2);
        else
            return m*power1(m*m, (n-1)/2);
    }

    public static void main(String[] args) {
        int powerNumber = power1(2, 9);
        System.out.println(powerNumber);
    }
}
