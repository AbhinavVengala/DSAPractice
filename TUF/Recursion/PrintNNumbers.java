package TUF.Recursion;

import java.util.Scanner;

public class PrintNNumbers {
    static void printN(int n) {
        if(n==3)
            return;
        System.out.println(n);
        n++;
        printN(n);
    }
    public static void main(String[] args) {
        // code here
        printN(0);
    }
}
