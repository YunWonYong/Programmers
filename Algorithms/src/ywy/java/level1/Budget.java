package ywy.java.level1;

public class Budget {

	public Budget() {
		// TODO Auto-generated constructor stub
	}
	
	public int solution(final int[] d, final int budget) {
		bubbleSort(d);
		int answer = 0;
		int index = 0;
		int range = d.length;
		int el = 0;
		int count = 0;
		int nextIndex = 0;
		while(true) {
			if (index == range) {
				if (el <= budget && answer < count) {
					answer = count;
				}
				break;
			}
			el += d[index++];
			if (el > budget) {
				if (count < (answer / 2)) {
					break;
				}
				index = ++nextIndex;
				if (count > answer) {
					answer = count;
				}
				count = 0;
				el = 0;
				continue;
			}
			count++;
		} 
		return answer;
	}
	
	public void bubbleSort(final int[] d) {
		int current = 0;
		int next = 0;
		int index = 0;
		int range = d.length-1;
		while(index < range) {
			current = d[index++];
			next = d[index];
			if (current > next) {
				d[index] = current;
				d[(--index > 1) ? index-- : index] = next;		
				continue;
			}
		}
	}
}	
