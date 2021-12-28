package level1;

public class PrimeNumberFind {
	public int solution(int n) {
		final boolean[] numberTable = new boolean[++n];
		int index = 2;
		int count = 2;
		do {
			if (numberTable[index] == false) {
				count += marking(numberTable, n, index);
			}
		} while(++index < n);
		return n - count;
	}
	
	private int marking(final boolean[] numberTable, final int n, final int no) {
		int temp = no;
		int count = 0;
		while((temp += no) < n) {
			if (numberTable[temp] == false) {
				count++;
				numberTable[temp] = true;
			}
		}
		return count;
	}
}
