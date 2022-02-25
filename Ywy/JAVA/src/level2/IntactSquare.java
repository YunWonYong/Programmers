package level2;

public class IntactSquare {
	public long solution(int w, int h) {
		long answer = (long) w;
		answer *= h;
		return answer - (w + h - gcd(w, h));
	}
	
	private int gcd(int n, int m) {
		if (m == 0) {
			return n;
		}
		return gcd(m, n % m);
	}
}
