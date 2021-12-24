package level1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFind {
	public int solution(int n) {
		if (n < 5) {
			return 2;
		} else if (n == 1) {
			return 0;
		}
		final int[] table = { 2, 3, 5, 7 };
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int index = 0;
		int range = table.length;
		int num = 0;
		n++;
		do {
			num = table[index];
			addNumMultiple(list, num, n);
		} while (++index < range);
		System.out.println(list.size());
		return n - list.size();
	}

	private void addNumMultiple(final List<Integer> list, int num, int n) {
		int temp = num;
		while (temp < n) {
			temp += num;
			if (temp < n && list.indexOf(temp) == -1) {
				list.add(temp);
			}
		}
	}
}
