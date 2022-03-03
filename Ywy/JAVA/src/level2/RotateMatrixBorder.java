package level2;

public class RotateMatrixBorder {
	private long[][] matrix;
	private int[] querie;
	public int[] solution(int rows, int columns, int[][] queries) {
		int index = 0;
		int range = queries.length;
		int[] answer = new int[range];
		matrix = new long[rows][columns];
		do {
			querie = queries[index];
			answer[index] = (int)matrixFill(rows, columns).rotate();
		} while(++index < range);
		return answer;
	}
	
	private RotateMatrixBorder matrixFill(int rows, int columns) {
		int x = querie[0] - 1;
		int y = querie[1] - 1;
		int xx = querie[2] - 1;
		int yy = querie[3] - 1;
		long el = 0;
		fill(y, x, yy, columns);
		while (++x < xx) {
			el = x + y == 0 ? 1: ((long)x * columns) + 1;
			matrix[x][y] = el + y;
			matrix[x][yy] = el + yy;
		}
		fill(y, x, yy, columns);
		return this;
	}
	
	private void fill(int y, int x, int yy, int columns) {
		long el = x + y == 0 ? 1: ((long)x * columns) + 1 + y;
		while(true) {
			if (matrix[x][y] == 0) {
				matrix[x][y] = el;
			}
			el++;
			if (y++ == yy) {
				return;
			}
		}
	}
	
	private long rotate() {
		int x = querie[0] - 1;
		int y = querie[1] - 1;
		int xx = querie[2] - 1;
		int yy = querie[3] - 1;
		long next = 0;
		long current = matrix[x][y];
		long min = current;
		while(true) {
			if (x < xx && y < yy) {
				next = matrix[x][++y];
			} else if(y == yy && x < xx) {
				next = matrix[++x][y];
			} else if (querie[1] -1 < yy) {
				next = matrix[x][--yy];
				y--;
			} else if (querie[0] - 1 < xx) {
				next = matrix[--xx][yy];
				x--;
			} else {
				return min;
			}
			matrix[x][y] = current;
			current = next;
			if (min > current) {
				min = current;
			}
		}
	}
}
