package level1;

public class NNumbersSpacedByX {
	public long[] solution(int x, int n) {
		final long[] answer = new long[n];
		long xx = (long) x;
		while (true) {
			answer[n - 1] = xx * n--;
			if (n == 0) {
				return answer;
			}
		}
	}
}
