package level1;

public class ColatzGuess {
	public int solution(int n) {
		double x = n * 1.0;
		int count = 0;
		while(true) {
			if (x == 1) {
				return count;
			} else if(count == 500) {
				return -1;
			} 
			count++;
			if (x % 2 == 0) {
				x /= 2;
				continue;
			}
			x *= 3;
			x++;
		}
	}
}
