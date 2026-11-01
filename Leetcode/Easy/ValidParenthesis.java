package Leetcode.Easy;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c: arr) {
            if(c == '(') {
                sta.push(')');
            } else if(c == '[') {
                sta.push(']');
            } else if(c == '{') {
                sta.push('}');
            } else {
                if(sta.isEmpty() || sta.pop()!=c) return false;
            }
        }
        return sta.isEmpty();
    }
}
