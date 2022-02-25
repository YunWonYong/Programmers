package level2;

public class Nara1234 {
	
	public String solution(int n) {
		StringBuffer sb = new StringBuffer();
		int digit = 0;
		while(n > 0) {
			digit = n % 3;
			if (digit == 0) {
				n--;
				digit = 4;
			}
			n /= 3;
			sb.append(digit);
		}
		return sb.reverse().toString();
	}
}
