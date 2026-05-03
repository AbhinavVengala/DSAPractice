package TUF.Patterns;

// 18 TUF

public class ReverseAlphabetReverseTriangle {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i < N; i++) {
            for (int ch = 'E'-i; ch <= 'E'; ch++) {
                System.out.print((char) ch +" ");
            }
            System.out.println();
        }
    }
}
