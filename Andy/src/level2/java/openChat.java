package level2.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//프로그래머스 Level 2,오픈채팅방
public class openChat {
    public String[] solution(String[] record) {   	
        Map<String,String> map = new HashMap<>();
        Stack<String> stack = new Stack<>();
        
        for(String d:record) {
        	String[] arr = d.split(" ");
        	if(arr[0].compareTo("Enter") == 0 || arr[0].compareTo("Change") == 0) {
        		map.put(arr[1], arr[2]);
        	}        	        	
        }

        for(String d:record) {
        	String[] arr = d.split(" ");
        	String str = map.get(arr[1]);
            
        	if(arr[0].compareTo("Enter") == 0) {
        		stack.push(str + "님이 들어왔습니다.");
        	}        	        	
        	else if(arr[0].compareTo("Leave") == 0) {
        		stack.push(str + "님이 나갔습니다.");
        	}
        }

        return stack.toArray(new String[stack.size()]);        
    }
}
