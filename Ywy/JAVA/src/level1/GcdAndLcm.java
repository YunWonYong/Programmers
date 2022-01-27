package level1;

public class GcdAndLcm {
	public int[] solution(int n, int m) {
		int gcd = gcd(n, m);
		return new int[] {gcd, lcm(n, m, gcd)};
	}
	
	private int gcd(int n, int m) {
		int temp = 0;
		while(true) {
			if (m == 0) {
				return n;
			}
			temp = n % m;
			n = m;
			m = temp;
		}
	}
	
	private int lcm(int n, int m, int gcd) {
		return n * (m / gcd);
	}
}
