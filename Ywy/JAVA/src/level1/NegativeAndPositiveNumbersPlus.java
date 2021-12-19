package level1;

public class NegativeAndPositiveNumbersPlus {
	public int solution(final int[] absolutes, final boolean[] signs) {
		int answer = 0;
		int index = 0;
		int range = absolutes.length;
		int no = -1;
		boolean sign = false;
		do {
			no = absolutes[index];
			sign = signs[index++];
			answer = sign ? answer + no : answer - no;
		} while(index < range);
		return answer;
	}
	
}
