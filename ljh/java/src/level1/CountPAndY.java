package level1;

/*
 * 문자열 내의 P와 Y의 개수
 */

public class CountPAndY {
	 public boolean solution(String s) {
	        boolean answer = true;
	        int pCount = 0;
	        int yCount = 0;
	        String ss = s.toLowerCase();
	        Character c;
	        
	        for(int i=0; i<ss.length(); i++) {
	        	c = ss.charAt(i);
	        	if(c == 'p') pCount++;
	        	if(c == 'y') yCount++;
	        }
	        
	        if(pCount != yCount) answer = false;
	        
	        return answer;
	 }
}

