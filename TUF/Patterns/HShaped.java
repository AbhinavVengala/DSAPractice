package TUF.Patterns;

// 20 TUF

public class HShaped {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            int space = 2 * (N - i);
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N-1; i >= 1; i--) {
            int space = 2 * (N - i);
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
