package level1;

/*
 * x만큼 간격이 있는 n개의 숫자(220129 - 220204)
 */

public class XMultiple {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long longX = (long)x;
		
		for(int i=1; i<=n; i++) {
			answer[i-1] = longX * i;
		}
		
		return answer;
	}
}
