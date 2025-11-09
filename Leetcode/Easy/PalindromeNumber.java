// Problem: Palindrome Number
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/palindrome-number/description/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int original_number = x;
        int rev = 0;
        if(x<0) return false;
        if(x!=0 && x%10==0) return false;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev == original_number)
            return true;
        else
            return false;
    }
}
