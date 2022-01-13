package level1;

public class ArrayByFlippingNumbers {
	public ArrayByFlippingNumbers() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] solution(long n) {
		int range = getRange(n);
		final int[] answer = new int[range];
		int index = 0;
		long digit = 10;
		long temp = 0;
		while(true) {
			if (index == range) {
				return answer;
			}
			temp = n / digit * digit;
			temp = n - temp;
			answer[index++] = (int)(temp / (digit / 10)); 
			digit *= 10;
			n -= temp;
		}
	}
	
	private int getRange(final long n) {
		int range = 0;
		long digit = 1;
		while(true) {
			if (n < digit) {
				return range;
			}
			range++;
			digit *= 10;
		}
	}
}
