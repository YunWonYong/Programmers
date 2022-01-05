package level1;

/*
 * 시저암호(211231 - 220107) 
 */

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
				
			}else { //문자가 공백이 아닐 때 즉, 알파벳일 때
				c = (char)(c + n);
				
				if(!(('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z'))) {
					c = (char)(c - 26);
				}
				
				sb.append(c);
				space = false;
			}
		}
		return sb.toString();
	}
}
