package ywy.java.level1;

public class TwoNumberPlus {
	private int[] answer;
	public TwoNumberPlus() {}
	
	public int[] solution(final int[] numbers) {
		answer = new int[1];
		int index = 0;
		int index2 = 1;
		int range = numbers.length;
		int num = numbers[index];
		answer[index] = num + numbers[index2++];
		do {
			if (index == index2) {
				continue;
			}
			
			if (index2 == range) {
				if (++index == range) {
					break;
				}
				num = numbers[index];
				index2 = 0;
			}
			setInsertSort(num + numbers[index2]);
			
		} while(index2++ < range);
		return answer;
	}

	private void setInsertSort(final int num) {
		int setIndex = binarySearch(num);
		if (setIndex == -1) {
			return;
		} 
		int range = answer.length + 1;
		int index = 0;
		int index2 = 0;
		int[] temp = answer;
		int element = 0;
		answer = new int[range--];
		while(true) {
			if (setIndex == -1 && index == range) {
				return;
			}
			if(setIndex == index) {
				setIndex = -1;
				element = num;
			} else if (index < range) {
				element = temp[index++];
			} 
			answer[index2++] = element;
		}
	}
	
	private int binarySearch(final int num) {
		int low = 0;
		int high = answer.length -1;
		if (answer[low] > num) {
			return low;
		} else if (answer[high] < num) {
			return high + 1;
		}
		int mid = high / 2;
		int element = -1;
		int element2 = -1;
		while (true) {
			element = answer[mid]; 
			if (element == num) {
				return -1;
			}

			
			if (element < num) {
				low = ++mid;
				mid += (high - low) / 2;
			} else if (element > num) {
				high = --mid;
				mid -= (high - low) / 2;
			}
			
			if (high < mid || low > mid ) {
				element = answer[low];
				element2 = answer[high];
				if ( element > element2 && element > num && element2 < num) {
					return low;
				} else if (element < element2 && element < num && element2 > num) {
					return high;
				}
				return -1;
			} 
		}
	}
	
//	public int[] solution(final int[] numbers) {
//	int index = 0;
//	int index2 = 1;
//	int range = numbers.length;
//	int num = 0;
//	Set<Integer> set = new HashSet<Integer>();
//	StringBuffer sb = new StringBuffer();
//	do {
//		num = numbers[index];
//		do {
//			if (index == index2) {
//				continue;
//			}
//			if (sb.indexOf(num + numbers[index2] + ",") > -1) {
//				continue;
//			}
//			sb.append(num + numbers[index2]).append(",");
//		} while(++index2 < range);
//		index2 = 0;
//	} while(++index < range);
//	final int[] answer = new int[set.size()];
//	index = 0;
//	Arrays.sort(set.toArray());
//	return answer; 
//}
}	
