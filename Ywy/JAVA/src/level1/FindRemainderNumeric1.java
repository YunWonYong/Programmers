package level1;

public class FindRemainderNumeric1 {

	public FindRemainderNumeric1() {
	}
	
	public int solution(final int n) {
		int x = 1;
		while(true) {
			if (n % ++x == 1) {
				return x;
			}
		}
		
	}
}
