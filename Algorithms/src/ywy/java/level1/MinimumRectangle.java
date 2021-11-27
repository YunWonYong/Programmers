package ywy.java.level1;

public class MinimumRectangle {

	public MinimumRectangle() {
	}

	public int solution(int[][] sizes) {
		int index = 0;
		int range = sizes.length;
		int[] ys = new int[range];
		int max = 0;
		int x = -1;
		int y = -1;
		do {
			x = sizes[index][0];
			y = sizes[index][1];
			ys[index] = y;
			if (y > max) {
				max = y;
			}
			if (x > max) {
				max = x;
			}
		} while (++index < range);

		index = 0;
		do {
			x = sizes[index][0];
			y = ys[index];
			if (max - y < max - x) {
				ys[index] = x;
			}
		} while (++index < range);
		return max * getMax(ys);
	}

	private int getMax(int[] arr) {
		int index = 0;
		int max = 0;
		do {
			if (max < arr[index]) {
				max = arr[index];
			}
		} while (++index < arr.length);
		return max;
	}
}
