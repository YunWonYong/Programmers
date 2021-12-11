package nattybear.level1;

import java.util.HashMap;

public class TwoOSixteen {

	private static class Solution {
		public String solution(int a, int b) {

			HashMap<Integer, String> days = new HashMap<Integer, String>();

			days.put(0, "FRI");
			days.put(1, "SAT");
			days.put(2, "SUN");
			days.put(3, "MON");
			days.put(4, "TUE");
			days.put(5, "WED");
			days.put(6, "THU");

			HashMap<Integer, Integer> month = new HashMap<Integer, Integer>();

			month.put(1, 31);
			month.put(2, 29);
			month.put(3, 31);
			month.put(4, 30);
			month.put(5, 31);
			month.put(6, 30);
			month.put(7, 31);
			month.put(8, 31);
			month.put(9, 30);
			month.put(10, 31);
			month.put(11, 30);
			month.put(12, 31);

			int sum = 0;

			for (int i = 1; i < a; i++)
				sum += month.get(i);

			sum += b - 1;

			return days.get(sum % 7);
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(5, 24));
	}
}
