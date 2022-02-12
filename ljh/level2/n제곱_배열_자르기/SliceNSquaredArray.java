package level2;

/*
 *	n^2 배열 자르기(220122-220128) 
 */

public class SliceNSquaredArray {
	
	// 첫번째 풀이(4ms)
	public int[] solution(int n, long left, long right) {
		int length = (int)(right- left +1);
		int[] answer = new int[length];
		int index = 0;
		long quotient = 0; //행
		long remainder = 0; //열
		
		for(long i=left; i<=right; i++) {
			quotient = i/n;
			remainder = i%n;
			answer[index++] = quotient > remainder? (int) quotient + 1 : (int) remainder + 1;
		}
		
		return answer;
	}
	
	// 두번째 풀이(2ms)
	public int[] solution2(int n, long left, long right) {
		int length = (int)(right-left+1);
		int[] answer = new int[length];
		long row = left/n +1; 
		long lastRow = right/n +1; 
		long col = left%n +1; 
		long lastCol = right%n +1;
		int index = 0;
		
		for(long i=row; i<lastRow; i++) {
			while(col<=n) {
				answer[index++] = i > col ? (int)i : (int)col;
				col++;

			}
			col = 1;
		}
			
		while(col<=lastCol) {
			answer[index++] =  lastRow > col ? (int)lastRow : (int)col;
			col++;
		}
		
		return answer;
	}
	
}
