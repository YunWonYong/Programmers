package level1;

import java.util.stream.IntStream;

/*
 * 평균 구하기(220122-220128)
 */

public class CalculateAverage {
	public double solution(int[] arr) {
		int sum = 0;
		int length = arr.length;
		
		for(int i=0; i<length; i++) {
			sum += arr[i];
		}
		
		return (double)sum/length;
	}
	
	// 스트림으로 풀어보기
	public double solution2(int[] arr) {
		return IntStream.of(arr).average().getAsDouble();
	}
}
