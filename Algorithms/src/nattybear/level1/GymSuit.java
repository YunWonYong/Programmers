package nattybear.level1;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class GymSuit {
	private static class Solution {
		public int solution(int n, int[] losts, int[] reserves) {
			Arrays.sort(losts);
			Arrays.sort(reserves);

			Helper helper = new Helper(losts, reserves);

			helper.help((x, y) -> x == y);
			helper.help((x, y) -> Math.abs(x - y) == 1);

			IntStream stream = Arrays.stream(helper.getLosts());

			int numberOfLostStudent = (int) stream.filter(x -> x != -1).count();

			return n - numberOfLostStudent;
		}
	}

	private static class Helper {
		private int[] losts;
		private int[] reserves;

		public Helper(int[] losts, int[] reserves) {
			this.losts = losts;
			this.reserves = reserves;
		}

		public void help(BiFunction<Integer, Integer, Boolean> predicate) {
			for (int i = 0; i < losts.length; i++) {
				for (int j = 0; j < reserves.length; j++) {
					int lost = losts[i];
					int reserve = reserves[j];
					if (predicate.apply(lost, reserve)) {
						losts[i] = -1;
						reserves[j] = -1;
						break;
					}
				}
			}
		}

		public int[] getLosts() {
			return losts;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();

		int[] losts = { 2, 4 };
		int[] reserves = { 1, 3, 5 };

		System.out.println(s.solution(5, losts, reserves));
	}
}
