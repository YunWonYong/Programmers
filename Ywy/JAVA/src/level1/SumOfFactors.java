package level1;

import semantics.Choice;

public class SumOfFactors {
	public SumOfFactors() {
		// TODO Auto-generated constructor stub
	}
	
	@Choice
	public int solution(final int n) {
		final boolean[] set = new boolean[n + 1];
		int answer = 0;
		int temp = 0;
		int left = 0;
		int right = 0;
		int mid = n / 2;
		while(left < n) {
			left++;
			right = n / left;
			if (left * right == n) {
				if (!set[left]) {
					set[left] = true;
					temp += left;
				}
				if (!set[right]) {
					set[right] = true;
					temp += right;
				}
			}
			answer += temp;
			temp = 0;
			if (left > mid) {
				break;
			}
		}
		return answer;
	}
	
	public int solution2(final int n) {
		if (n == 0) {
			return n;
		}
		boolean[] set = new boolean[n + 1];
		int answer = 0;
		int left = 1;
		int right = 0;
		int range = n / 2;
		range--;
		do {
			right = n / left;
			if (left * right == n) {
				answer += getSumValue(set, left, right);
			}
		} while(++left < range);
		return answer;
	}
	
	private int getSumValue(final boolean[] set, int...nums) {
		int index = 0;
		int range = nums.length;
		int result = 0;
		int num = 0;
		while(index < range) {
			num = nums[index++];
			if (set[num]) {
				continue;
			}
			set[num] = true;
			result += num;
		}
		return result;
	}
}
