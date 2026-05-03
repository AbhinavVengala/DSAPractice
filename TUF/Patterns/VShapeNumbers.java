package TUF.Patterns;

public class VShapeNumbers {
    public static void main(String[] args) {
        int N = 5;
        int space = 2 * (N-1);
        for (int i = 1; i <= N; i++) {
            // Number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
}
