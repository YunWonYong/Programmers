package nattybear.level1;

public class Remainder {
	private static class Solution {
		public int solution(int n) {
			int answer = 0;
			for (int x = 2; x < n; x++)
				if (n % x == 1) {
					answer = x;
					break;
				}
			return answer;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(10));
		System.out.println(s.solution(12));
	}
}
