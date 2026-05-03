package TUF.Patterns;

// 17 TUF

public class AlphabetsPyramid {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i < N; i++) {
            // Space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Characters
            char ch = 'A';
            int breakPoint = (2 * i - 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if(j <= breakPoint) ch++;
                else ch--;
            }
//            for (int j = 0; j < N - i - 1; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
