package level1;

public class CaesarCipher {
	private final static int UPPER_Z;
	private final static int LOWER_A;
	private final static int LOWER_Z;
	private final static int BLANK_AT;
	static {
		UPPER_Z = 90;
		LOWER_A = 97;
		LOWER_Z = 122;
		BLANK_AT = 32;
	}
	public CaesarCipher() {}
	
	public String solution(String s, int n) {
		StringBuffer answer = new StringBuffer();
		int index = 0;
		int range = s.length();
		do {
			answer.append(moveAt(n, s.charAt(index)));
		} while(++index < range);
		return answer.toString();
	}
	
	private char moveAt(int n, char c) {
		if (c > BLANK_AT) {
			do {
				c++;
				if (c > LOWER_Z) {
					c = (char) (LOWER_Z - 25);
				} else if (c < LOWER_A && c > UPPER_Z) {
					c = (char) (UPPER_Z - 25);
				}
			} while(--n > 0);
		}
		return c;
	}
}
