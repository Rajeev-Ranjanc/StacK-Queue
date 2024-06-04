package questions;

import java.util.Stack;

/*

    https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
    Meta Asked
    As mentioned in the question that string contains only parenthesis so, I just
    need to check if it is closing parenthesis then check the top of stack is it
    open if stack is not open if yes them simply pop the brackets else put the ch
    into the stack.else part of the opening bracket also put the character into stack.

 */
public class MInAddToMakeEqual {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(minAddToMakeValid(s));

    }


    public static int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == ')') {

                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }

            } else {
                stack.push(ch);
            }

        }


        return stack.size();

    }

}
