package TUF.Recursion;

public class SumOfNNumbers {
    // Parameterised methods
//    static int sum = 0;
//    static int summation(int i, int n) {
//        if(n==0) {
//            System.out.println(0);
//            return 0;
//        }
//        return summation(i-1, sum+1);
//    }

    // Functional way
    static int summation(int n) {
        if(n==0) return 0;
        return n + summation(n-1);
    }

    public static void main(String[] args) {
        System.out.println(summation(4));
    }
}
