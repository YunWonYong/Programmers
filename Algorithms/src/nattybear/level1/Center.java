package nattybear.level1;

public class Center {
	private static class Solution {
		public String solution(String s) {
			int len = s.length();
			int i = len / 2;
			if (len % 2 == 0)
				return s.substring(i - 1, i + 1);
			else
				return s.substring(i, i + 1);
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("abcde"));
		System.out.println(s.solution("qwer"));
	}
}
