package level1;

import java.util.Arrays;

/*
 * 문자열 내림차순으로 정렬하기
 */

public class SortInDescendingOrder {
	public String solution(String s) {
		int[] nums = new int[s.length()];
		String answer = "";
		
		for(int i=0; i<s.length(); i++) {
			nums[i] = -1 * s.charAt(i);
		}
		Arrays.sort(nums);
		for(int j=0; j<nums.length; j++) {
			 answer += (char)(nums[j] * -1);
		}
		
		return answer;
	}
	
}
