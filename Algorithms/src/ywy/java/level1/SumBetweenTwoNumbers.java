package ywy.java.level1;

public class SumBetweenTwoNumbers {
	public SumBetweenTwoNumbers() {
		// TODO Auto-generated constructor stub
	}

	public long solution(int a, int b) {
		long temp = a - b;
		return (a + b) * ((temp > 0 ? temp : (~temp) + 1) + 1) / 2;
	}
}
