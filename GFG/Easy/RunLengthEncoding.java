package GFG.Easy;

public class RunLengthEncoding {
    public static String encode(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int count = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
                count++;
                i++;
            }
            ans.append(ch);
            ans.append(count);
        }
        return ans.toString();
    }
}
