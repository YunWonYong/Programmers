package level1;

/*
 * 이상한 문자 만들기(220108 - 220114)
 */

public class MakeStrangeText {
	public String solution(String s) {
		StringBuffer sb = new StringBuffer(s.length()+1);
		String[] arr = s.split(" ", -1);

		for(int i=0; i<arr.length; i++) {
			sb.append(makeText(arr[i])+" ");
		}
		
		return sb.toString().substring(0, s.length());
	}
	
	public String makeText(String s) {
		char[] chars = s.toCharArray();
		
		for(int i=0; i<chars.length; i+=2) 
			chars[i] = Character.toUpperCase(chars[i]);
		for(int i=1; i<chars.length; i+=2) 
			chars[i] = Character.toLowerCase(chars[i]);		
		
		return new String(chars);
	}
}
	
	

