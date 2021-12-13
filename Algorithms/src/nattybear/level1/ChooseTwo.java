package nattybear.level1;

import java.util.*;

public class ChooseTwo {
	private static class Solution {
		public int[] solution(int[] numbers) {

			HashSet<Integer> set = new HashSet<>();

			int size = numbers.length;

			for (int i = 0; i < size; i++)
				for (int j = i + 1; j < size; j++)
					set.add(numbers[i] + numbers[j]);

			ArrayList<Integer> list = new ArrayList<Integer>(set);

			Collections.sort(list);

			return list.stream().mapToInt(x -> x).toArray();
		}
	}

	public static void main(String[] args) {

		Solution s = new Solution();

		Arrays.stream(s.solution(new int[] { 2, 1, 3, 4, 1 })).forEach(System.out::println);
	}
}
