package questions;

import java.util.Stack;

/*
https://leetcode.com/problems/implement-queue-using-stacks/

    Deletion Efficient implementation
    it means to deletion elements from the stack will take O(1) time insertion may take O(N)
    Insertion Efficient is also there check code

 */

public class ImplementationQ_Stack {
    Stack<Integer> first;
    Stack<Integer> second;

    ImplementationQ_Stack() {

        first = new Stack<>();
        second = new Stack<>();

    }

    public void push(int x) {


        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(x);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }

    }

    public int pop() {

        return first.pop();

    }
    public int peek(){
        return first.peek();
    }
    public boolean empty() {
    return first.isEmpty();
    }

    public static void main(String[] args) {
        /*

    ["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
         */
        ImplementationQ_Stack st = new ImplementationQ_Stack();
        st.push(1);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }

}
