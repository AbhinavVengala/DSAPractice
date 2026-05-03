package TUF.Patterns;

public class IncNumberTriangle {
    public static void main(String[] args) {
        int count = 1;
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
