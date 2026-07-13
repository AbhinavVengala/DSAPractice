package TUF.Recursion;

public class PrintNto1 {
    static void printNto1(int n) {
        if(n==0)
            return;
        System.out.println(n);
        n--;
        printNto1(n);
    }
    public static void main(String[] args) {
        // code here
        printNto1(4);
    }
}
