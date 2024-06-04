package questions;

import java.util.Arrays;
import java.util.Stack;

/*
    Leetcode as well as hackerrank
https://www.hackerrank.com/challenges/balanced-brackets/problem?isFullScreen=true
 */
public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{{[[(())]]}}";
        System.out.println(isBalanced(s));

    }

    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                if (isvalid(stack.peek(), ch)) {
                    stack.pop();
                } else {
                    return "NO";
                }
            }

        }

        return "YES";

    }

    public static boolean isvalid(char ch, char top) {
        return (ch == '(' && top == ')') || (ch == '{' && top == '}') || (ch == '[' && top == ']');
    }

}
