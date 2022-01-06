package level1;

/*
 * 시저암호(211231 - 220107) 
 */

// 알파벳 소문자, 대문자 분리 후 문제 수정. 9,11,12,13 실패

public class CaesarCipher {

	public String solution(String s, int n) {
		StringBuffer sb = new StringBuffer(s.length());
		boolean space = false; // 이전 문자가 공백인지 아닌지 판별
		char c; // 문자 임시 저장
		
		for(int i=0; i<s.length(); i++) {			
			c = s.charAt(i);
			
			if(c == ' ') { // 문자가 공백일 때
				if(space == true) {
					continue;
				}
				sb.append(' ');
				space = true;
				
			}else if('a' <= c && c <= 'z'){ //알파벳 소문자일 때
				c = (char)(c + n);
				
				if(!('a' <= c && c <= 'z')) {
					c = (char)(c - 26);
				}
				
				sb.append(c);
				space = false;
			}else { //알파벳 대문자일 때
				c = (char)(c + n);
				
				if(!('A' <= c && c <= 'Z')) {
					c = (char)(c - 26);
				}
				
				sb.append(c);
				space = false;
			}
		}
		return sb.toString();
	}
	
}
