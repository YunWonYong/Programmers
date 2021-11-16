package ywy.java.level1;

public class TernaryFlip {

	public TernaryFlip() {
		// TODO Auto-generated constructor stub
	}
	
	public int solution(int n) {
		StringBuffer sb = new StringBuffer().append(n % 3);
		int quotient = 0;
		while(true) {
			
			quotient = n / 3;
			if (n < 3) {
				break;
			}
			sb.append(quotient % 3);
			n = quotient;
		}
		char[] ats = sb.toString().toCharArray();
		int range = ats.length - 1;
		int answer = Character.getNumericValue(ats[range]);
		int root = 1;
		while(range-- > 0) {
			answer += Character.getNumericValue(ats[range]) * pow(3, root++);
		}
		return answer;
	}
	
	public long pow(long num, long root) {
		long result = 1L;
		while(true) {
			result *= num;
			if (--root == 0) {
				return result;
			}
		}
	}
}
