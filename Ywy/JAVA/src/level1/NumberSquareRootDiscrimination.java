package level1;

import semantics.Choice;

public class NumberSquareRootDiscrimination {
	public long solution(final long n) {
		double temp = n * 1.0 / 2;
		long num = 0;
		while(num <= temp && temp > 1) {
			temp -= ++num;
		}
		
		num = (long)(temp + temp);
		return num * num == n ? ++num * num : -1;
	}
	
	@Choice
	public long solution2(final long n) {
		long sqrtNum = (long)Math.sqrt(n);
		if (Math.pow(sqrtNum++, 2) == n) {
			return sqrtNum * sqrtNum;
		}
		return - 1;
	}
}
