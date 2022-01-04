package level1;

import java.util.Arrays;

/*
 * 서울에서 김서방 찾기(211224 - 211230) 
 */

public class FindKim {
	// 속도 : StringBuffer > StringFormat > + 기호. StringBuffer 사용하자.
	
    public String solution(String[] seoul) {
    	int index = 0;
    	for(int i=0; i<seoul.length; i++) {
    		if(seoul[i].equals("Kim")) {
    			index = i;
    			break;
    		}
    	}
    	
        StringBuffer sb = new StringBuffer("김서방은 ");
        sb.append(index);
        sb.append("에 있다");
        return sb.toString();
    }
    
    public String solution2(String[] seoul) {
    	int index = 0;
    	for(int i=0; i<seoul.length; i++) {
    		if(seoul[i].equals("Kim")) {
    			index = i;
    			break;
    		}
    	}
    	return String.format("김서방은 %s에 있다",index);
    }
 
    public String solution3(String[] seoul) {
    	int index = 0;
    	for(int i=0; i<seoul.length; i++) {
    		if(seoul[i].equals("Kim")) {
    			index = i;
    			break;
    		}
    	}
    	return "김서방은 "+index+"에 있다";
    }
}
