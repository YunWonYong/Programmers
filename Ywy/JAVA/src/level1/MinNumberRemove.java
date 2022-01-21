package level1;

public class MinNumberRemove {
	public int[] solution(final int[] arr) {
		int range = arr.length;
		if (range == 1) {
			return new int[] {-1};
		}
		
		int minValueIndex = getMinValue(arr, --range);
		final int[] answer = new int[range];
		int index = 0;
		int index2 = -1;
		while(true) {
			if (++index2 == minValueIndex) {
				continue;
			}
			answer[index++] = arr[index2];
			if (index == range) {
				return answer;
			}
		}
	}
	
	private int getMinValue(final int[] arr, final int range) {
		int index = 0;
		int minIndex = 0;
		int minValue = arr[index];
		while(true) {
			if (index == range) {
				return minIndex;
			}
			if (minValue > arr[++index]) {
				minValue = arr[index];
				minIndex = index;
			}
		}
	}
}
