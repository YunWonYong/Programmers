package level1;

public class NumberDescSort {
	
	public long solution(final long n) {
		final char[] arr = String.valueOf(n).toCharArray();
		final int range = arr.length - 1;
		int index = 0;
		int jumpIndex = -1;
		char temp = 0;
		while (index < range) {
			temp = arr[index++];
			if (temp < arr[index]) {
				if (jumpIndex == -1) {
					jumpIndex = index;
				}
				arr[index - 1] = arr[index];
				arr[index] = temp;
				index -= index > 1 ? 2 : 0;
				continue;
			}
			
			if (jumpIndex > -1) {
				index = jumpIndex;
				jumpIndex = -1;
			}
		}
		return Long.parseLong(new String(arr));
	}
}
