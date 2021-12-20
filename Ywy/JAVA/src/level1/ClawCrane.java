package level1;

public class ClawCrane {
	public int solution(final int[][] board, final int[] moves) {
		int answer = 0;
		final int range = moves.length;
		final int[] stack = new int[range];
		int index = 0;
		int col = -1;
		int item = 0;
		int top = 0;
		
		do {
			col = moves[index++];
			item = boardSearch(board, --col);
			if (item > 0) {
				if(top > 0 && item == stack[top - 1]) {
					stack[--top] = 0;
					answer += 2;
					continue;
				}
				stack[top++] = item;
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
