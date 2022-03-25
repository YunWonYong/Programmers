package Programmers.test;

import java.util.Stack;

/**
 * 짝지어 제거하기 (12973)
 */

class DeletePair {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }
            if (stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        return stack.isEmpty()? 1 : 0;
    }
}