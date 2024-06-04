package questions;

import java.util.Stack;

/*
https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/

 */
public class MinInsertions {
    public static void main(String[] args) {
        String s = "(()))";
        System.out.println(minInsertions(s));
    }

    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
                count = 0;
            } else {
                count++;
                if (count == 2 && !stack.isEmpty()) {
                    stack.pop();
                    count = 0;
                } else {
                    ans += 1;
                }
            }
        }
        ans+=stack.size();
        return ans;
    }
}
