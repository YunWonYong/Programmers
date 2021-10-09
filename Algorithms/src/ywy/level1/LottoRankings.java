package ywy.level1;

public class LottoRankings {
	public int[] solution(final int[] lottos, final int[] winNums) {
		int lotto = 0;
		int max = 0;
		int min = 0;
		int range = lottos.length;
		int index = 0;
		do {
			lotto = lottos[index];
			if (lotto == 0) {
				max++;
				continue;
			}
			if (sameCheck(lotto, winNums)) {
				min++;
			}
		} while((++index) < range);
		int ranking = getRanking(min);
		return new int[] {ranking - max, ranking};
	}
	
	private boolean sameCheck(final int lotto, final int[] winNums) {
		int index = 0;
		int range = winNums.length;
		int win = 0; 
		do {
			win = winNums[index];
			if (lotto == win) {
				return true;
			}
		} while((++index) < range);
		return false;
	}
	
	private int getRanking(final int num) {
		return num == 6 ? 1 : num == 5 ? 2 : num == 4 ? 3 : num == 3 ? 4 : num == 2 ? 5 : 6; 
	}
}
