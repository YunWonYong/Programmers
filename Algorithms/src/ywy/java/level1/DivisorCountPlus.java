package ywy.java.level1;

public class DivisorCountPlus {

	public DivisorCountPlus() {
	}

	public int solution(int left, int right) {
		int[] divisers = new  int[right -left + 1];
		boolean[] plusFlag = new boolean[right -left + 1];
		int index = 0;
		while(left <= right) {
			divisers[index] = left;
			plusFlag[index++] = diviserFind(left); 
		    left++;
		}
		return result(divisers, plusFlag);
	}

	private boolean diviserFind(int num) {
        if (num == 1) {
			return false;
		} else if (num <= 3) {
			return true;
		}
		int left = 2;
		int divinum = (num / 2) + 1;
		int right = divinum;
		int count = 2;
		while(true) {
			if (left == divinum) {
				if (count % 2 == 0) {
					return true;
				}
				return false;
			}
			if (left * right == num) {
				count++;
                if (left != right) {
                    count++;
                }
			}
			if (right == left) {
				right = divinum;
				left++;
				continue;
			}
			right--;
		}
	}

	private int result(final int[] divisers, final boolean[] plusFlag) {
		int index = 0;
		int range = divisers.length;
		int answer = 0;
		int temp = 0;
		do {
			temp = divisers[index];
			answer += plusFlag[index] ? temp: (~temp) + 1;
		} while(++index < range);
		return answer;
	}
	
}
