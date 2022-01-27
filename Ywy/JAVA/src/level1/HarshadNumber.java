package level1;

public class HarshadNumber {
	public boolean solution(int x) {
		return x % getDigitSumNum(x) == 0;
	}
	
	private int getDigitSumNum(int n) {
		int sumNum = 0;
		while (true) {
			if (n == 0) {
				return sumNum;
			}
			sumNum += n % 10;
			n /= 10;
		}
	}
}
