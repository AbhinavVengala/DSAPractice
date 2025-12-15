package Udemy_Practice.AbdulBariDSA.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int factValue = fact(4);
        System.out.println(factValue);
    }
    static int fact(int n) {
        if(n == 0) return 1;
        return fact(n-1)*n;
    }
}
