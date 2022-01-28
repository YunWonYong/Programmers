package level1;

/*
 * 콜라츠 추측 (220122-220128)
 */

public class CollatzConjecture {

	public int solution(int num) {
		int count = 0;
		long n = (long)num;
		
		while( n != 1) {
			n = collatz(n);
			count++;
		}
		
		return count > 500? -1 : count;
	}
	
	public long collatz(long n) {
		return n%2 == 0? n/2 : n*3 + 1;
	}
}
