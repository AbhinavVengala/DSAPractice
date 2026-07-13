package TUF.Math;

public class GCD {
    // Euclidean Algorithm
    public static int gcd(int a, int b) {
        // code here
        while (a>0 && b>0) {
            if (a>b)
                a %= b;
            else
                b %= a;
        }
        if (a == 0)
            return b;
        else
            return a;
    }
}
