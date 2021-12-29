package level1;

import java.util.regex.Pattern;

/*
 * 문자열 다루기 기본(211224 - 211230)
 */

public class HandlingString {

	// 풀이1
	public boolean solution(String s) {
		boolean isNumber = true;
        int i;
        boolean checkLength;
		
		for(i=0; i<s.length(); i++) {
			if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				isNumber = false;
				break;
			}
		}
        
        checkLength = (i == 4 || i == 6)? true : false;
        
        return isNumber && checkLength;
    }
	
	// 풀이2
	public boolean solution2(String s) {
		String pattern = "^[0-9]*$";
		boolean regex = Pattern.matches(pattern, s);
	
        return (s.length() == 4 || s.length() == 6? true: false) && regex;
    }
}
