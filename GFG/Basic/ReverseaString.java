package GFG.Basic;

public class ReverseaString {
        public static String reverseString(String s) {
        // code here
        char c[] = s.toCharArray();
        int left = 0, right = c.length-1;
        while(left<right) {
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        return new String(c);
    }
}

// Two pointer approach