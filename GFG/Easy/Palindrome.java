package GFG.Easy;

public class Palindrome {
    public boolean isPalindrome(int n) {
        // Code here
        int original_number = n;
        int rev = 0;
        while(n>0){
            int pop = n%10;
            rev = rev * 10 + pop;
            n/=10;
        }
        if(rev == original_number) return true; else return false;
    }
}
