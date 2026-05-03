package TUF.Patterns;

// 16 TUF

public class AlphabetTriangleSameLetterRow {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            int ch = 'A' + i - 1;
            for (int j=0; j<i; j++) {
                System.out.print((char) ch+" ");
            }
            System.out.println();
        }
    }
}
