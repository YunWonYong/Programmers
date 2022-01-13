package level1;

import java.util.stream.IntStream;

/*
 * 약수의 합(220108 - 220114)
 */

public class SumOfDivisor {
	// 최소 범위로 약수 구하기
	public int solution(int n) {
		int sum = 0;
		double sqrt = Math.sqrt(n);
		
		for(int i=1; i<sqrt; i++) {
			if(n%i == 0) {
				sum += i;
				sum += n/i;
			}
		}
		
		if(n%sqrt == 0) sum += sqrt;
		
		return sum;
	}
	
	// 스트림 이용하기
	public int solution2(int n) {
		return IntStream.rangeClosed(1, n).filter(v -> n%v == 0).sum();
	}
}
