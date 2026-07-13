package TUF.Recursion;

public class PrintName {
    static void printName(int n) {
        if(n==3)
            return;
        System.out.println("Abhinav");
        n++;
        printName(n);
    }
    public static void main(String[] args) {
        // code here
        printName(0);
    }
}
