package level1;

/*
 * 핸드폰 번호 가리기 (220129 - 220204)
 */

public class PhoneNumberMasking {
	// 방법1 : String.repeat(int i) 함수는 jdk 11부터 사용 가능.
//	public String solution(String phone_number) {
//		int num = phone_number.length() - 4;
//		return "*".repeat(num) + phone_number.substring(num);
//	}
	
	// 방법2
	public String solution(String phone_number) {
		int length = phone_number.length();
		int point = length - 4;
		int count = 0;
		StringBuffer sb = new StringBuffer(length);
		
		while(count++ < point) {
			sb.append("*");
		}
		for(int i=point; i<length; i++) {
			sb.append(phone_number.charAt(i));
		}
		return sb.toString();
	}
}
