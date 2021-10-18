package ywy.java.level1;
/**
 * 로또 종이가 망가져 특정 숫자를 볼 수 없다.
 * 이 때 최대 등수와 최소 등수를 구하는 알고리즘 문제이다.<br>
 * 6개의 로또번호와 6개의 당첨번호가 있다.
 * 로또번호를 나타내는 배열의 요소 중 정수 0 이있다면 최대 맞춘 정답의 수는 올라가고
 * 최소 맞춘 정답의 수는 변동이없다.
 * <pre>
 * int[] lottos = {44, 1, 0, 0, 31, 25};
 * int[] winNums = {31, 10, 45, 1, 6, 19};
 * new LottoRankings().solution(lottos, winNums);
 * </pre>
 * @author ywy
 * @since 2021/10/09
 **/
public class LottoRankings {
	public LottoRankings() {}
	/**
	 * 
	 * @param int[] lottos, int[] winNums
	 * @return new int[] {max, min}
	 * 
	 **/
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
		return new int[] {getRanking(max + min), getRanking(min)};
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
