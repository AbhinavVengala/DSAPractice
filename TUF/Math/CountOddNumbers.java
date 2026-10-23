package TUF.Math;

public class CountOddNumbers {
    public int countOddDigit(int n) {
        int count=0;
        while(n>0) {
            int num = n%10;
            if(num % 2 != 0) count++;
            n=n/10;
        }
        return count;
    }
}
