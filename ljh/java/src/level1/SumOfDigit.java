package level1;

/*
 * 자릿수의 합 (220108 - 220114) 
 */

public class SumOfDigit {

	public int solution(int n) {
		int sum = 0;
		
		while(n>0) {
			sum += (n%10);
			n /= 10;
		}
		
		return sum;
	}
}
