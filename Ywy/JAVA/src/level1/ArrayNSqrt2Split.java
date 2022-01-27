package level1;

public class ArrayNSqrt2Split {
	public int[] solution(int n, int left, int right) {
		int row = left / n;
		int col = left % n;
		int range = right - --left;
		int[] answer = new int[range];
		int index = 0;
		int temp = 0;
		while (true) {
			++row;
			do {
				if (row > n || index == range) {
					return answer;
				}
				temp = col + 1;
				answer[index++] = temp < row ? row: temp;
			} while(++col < n);
			col = 0;
		}
	}
}
