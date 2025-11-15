// Problem: Valid Palindrome
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
        public boolean isPalindrome(String s) {
        StringBuilder text = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                text.append(Character.toLowerCase(c));
            }
        }
        int left=0, right=text.length()-1;
        while(left<right) {
            if(text.charAt(left)!=text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
