package level1;

/*
 * 문자열을 정수로 바꾸기 (211231 - 220107)
 */

public class StringToInteger {
	public int solution(String s) {
		boolean negative = false;
		int i = 0;
		int answer = 0;
		
		if(s.charAt(0) == '-') {
			negative = true;
			i = 1;
		}
		
		while(i < s.length()) {
			answer = answer*10 + (s.charAt(i) - '0');
			i++;
		}
		
		if(negative == true) answer *= -1;
		
		return answer;
	}
	
	public int solution1(String s) {
		
		return Integer.parseInt(s);
	}
}
