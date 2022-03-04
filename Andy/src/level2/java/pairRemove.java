package level2.java;

import java.util.Stack;

//프로그래머스 Level 2,짝지어 제거하기
public class pairRemove {
    public int solution(String s)
    {
        Stack<String> stack = new Stack<>();        
        for(int i=0;i<s.length();i++) {
        	String tmp = String.valueOf(s.charAt(i));
        	if(stack.size()>0 && stack.peek().compareTo(tmp) == 0) {
        		stack.pop();
        	}
        	else {
        		stack.push(tmp);
        	}
        }
        
        return stack.size()>0?0:1;
    }
}
