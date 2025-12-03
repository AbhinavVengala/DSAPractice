package GFG.Easy;

public class CountDigits {
    public int countDigits(int n) {
        // code here
        if(n==0) return 1;
        int count = 0;
        while(n>0) {
            n/=10;
            count+=1;
        }
        return count;
    }
}
