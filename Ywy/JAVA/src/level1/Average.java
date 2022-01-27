package level1;

public class Average {
	public double solution(int[] arr) {
		int index = 0;
		int range = arr.length;
		double sumVal = 0;
		while(true) {
			sumVal += arr[index++];
			if (index == range) {
				return sumVal / range;
			}
		}
	}
}
