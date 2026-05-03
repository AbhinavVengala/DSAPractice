package TUF.Patterns;

public class AlphabetTriangle {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
