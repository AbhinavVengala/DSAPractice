package TUF.Patterns;

// 15 TUF

public class AlphabetReverseTriangle {
    public static void main(String[] args) {
        int N = 5;
        for (int i = N; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
