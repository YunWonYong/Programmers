package ywy.level1;

public class ClawCrane {
	public int solution(final int[][] board, final int[] moves) {
		int answer = 0;
		final int[] temp = new int[moves.length];
		int index = 0;
		final int range = moves.length;
		int col = -1;
		int item = 0;
		int prev = 0;
		int next = 0;
		int prevItem = -1;
		
		do {
			col = moves[index++];
			item = boardSearch(board, --col);
			if (item > 0) {
				temp[next++] = item;
				if (next > 1) {
					prev = prev < 0 ? 0 : prev;
					prevItem = temp[prev++];
					if (item == prevItem) {
						temp[--next] = 0;
						temp[--prev] = 0;
						next = prev--;
						answer += 2;
					}
				}
			}
		} while(index < range);
		return answer;
	}
	
	private int boardSearch(final int[][] board, int col) {
		int result = -1;
		int row = 0;
		int range = board.length;
		do {
			result = board[row][col];
			if (result > 0) {
				board[row][col] = 0;
				return result;
			}
		} while((++row) < range);
		return result;
	}
}
