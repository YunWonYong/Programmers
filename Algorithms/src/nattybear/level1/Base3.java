package nattybear.level1;

import java.util.ArrayList;

public class Base3 {
	private static class Solution {
		public int solution(int n) {
			return base10(base3(n, new ArrayList<Integer>()));
		}

		ArrayList<Integer> base3(int n, ArrayList<Integer> xs) {
			if (n < 3) {
				xs.add(n);
				return xs;

			} else {
				int q = (int) Math.floor(n / 3);
				int r = n % 3;
				xs.add(r);
				return base3(q, xs);
			}
		}

		int base10(ArrayList<Integer> xs) {
			int sum = 0;
			int size = xs.size();

			for (int i = 0; i < size; i++)
				sum += xs.get(i) * Math.pow(3, size - i - 1);

			return sum;
		}
	}

	public static void main(String[] args) {

		Solution s = new Base3.Solution();

		System.out.println(s.solution(45));
		System.out.println(s.solution(125));
	}
}
