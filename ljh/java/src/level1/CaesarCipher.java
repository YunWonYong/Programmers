package level1;

/*
 * 시저암호(211231 - 220107) 
 */

// 알파벳 소문자, 대문자 분리 후 문제 수정. 9,11,12,13 실패
// 조건식 간단하게 다듬기
// 문제 이해를 잘못해서 연속된 여러칸의 공백을 한칸 공백으로 줄이기를 함... => 공백 줄이기 적용 X

public class CaesarCipher {

	public String solution(String s, int n) {
		StringBuffer sb = new StringBuffer(s.length());
		char c; // 문자 임시 저장
		
		for(int i=0; i<s.length(); i++) {			
			c = s.charAt(i);
			
			if(c == ' ') { // 문자가 공백일 때
				sb.append(' ');
			}else if('a' <= c && c <= 'z'){ //알파벳 소문자일 때
				c = (char)(c + n);
				if(c > 'z') {
					c = (char)(c - 26);
				}
				sb.append(c);
			}else { //알파벳 대문자일 때
				c = (char)(c + n);
				if(c > 'Z') {
					c = (char)(c - 26);
				}
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
}
