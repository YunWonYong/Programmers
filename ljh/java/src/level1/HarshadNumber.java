package level1;

/*
 * 하샤드 수 (220122-220128)
 */

public class HarshadNumber {
	public boolean solution(int x) {
		int sum = 0;
		int num = x;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return x % sum == 0;
	}
}
