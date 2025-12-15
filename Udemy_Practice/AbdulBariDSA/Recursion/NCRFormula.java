package Udemy_Practice.AbdulBariDSA.Recursion;

public class NCRFormula {
    static int fact(int n) {
        if(n==0) return 1;
        return fact(n-1)*n;
    }

    static int nCr(int n, int r) {
        int num, den;
        num = fact(n);
        den = fact(r)*fact(n-r);
        return num/den;
    }

    static int nCrRecursive(int n, int r) {
        if(n==r||r==0) return 1;
        return nCrRecursive(n-1, r-1)+nCrRecursive(n-1, r);
    }

    public static void main(String[] args) {
        System.out.println(nCrRecursive(4,2));
    }
}
