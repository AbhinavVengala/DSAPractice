package TUF.Patterns;

// 19 TUF

public class DiamondSpaces {
    public static void main(String[] args) {
        int N = 5;
        int space = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= N-i; j++) {
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
    }
}
