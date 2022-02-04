package level1;

import semantics.Choice;

public class MatrixSum {
	
	@Choice
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int index = 0;
		int index2 = 0;
		int range = arr1.length;
		int range2 = arr1[0].length;
		while(true) {
			if (index == range) {
				return arr1;
			}
			do {
				arr1[index][index2] += arr2[index][index2]; 
			} while(++index2 < range2);
			index2 = 0;
			index++;
		}
	}
	
	
	public int[][] solution2(int[][] arr1, int[][] arr2) {
		int index = 0;
		int range = arr1.length;
		final int[][] answer = new int[range][arr1[0].length];
		while(true) {
			answer[index] = (int[])solution2(arr1[index], arr2[index]);
			if (++index == range) {
				return answer;
			}
		}
	}
	
	private Object solution2(Object param1, Object param2) {
		if (param1 instanceof Integer) {
			return (Integer)param1 + (Integer)param2;
		}
		int index = 0;
		int[] arr1 = (int[]) param1;
		int[] arr2 = (int[]) param2;
		int range = arr1.length;
		final int[] result = new int[range];
		while(true) {
			result[index] = (int)solution2(arr1[index], arr2[index]);
			if (++index == range) {
				return result;
			}
		}
	}
}
