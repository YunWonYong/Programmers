package level1;

/*
 * 최대공약수와 최대공배수 (220122-220128)
 */

// 속도 : 방법 3 > 방법 2> 방법 1-1 > 방법 1-2. 
// 0.1ms 차이 이므로 크게 유의미하진 않다.

public class GCDandLCM2 {
	// 방법 2 : 두 수를 한꺼번에 분해하기
	public int[] solution(int n, int m) {
		int[] answer = {1,1};
		int divisor = 2;
		
		while(n>divisor || m>divisor) {
			if(n%divisor==0 && m%divisor==0) {
				n /= divisor;
				m /= divisor;
				answer[0] *= divisor; 
			}else {
				divisor++;
			}
		}
		
		answer[1] = n*m*answer[0];
		
		return answer;
		
	}
	
	// 방법 3 : 유클리드 호제법 사용하기
	public int[] solution2(int n, int m) {
		int[] answer = {1, 1};
		int large = n;
		int small = m;
		if(n < m) {
			large = m;
			small = n;
		}
		
		int temp = large % small;
		
		while(temp != 0) {
			large = small;
			small = temp;
			temp = large % small;
		}
		
		answer[0] = small;
		answer[1] = n*m/answer[0];
		
		return answer;
		
	}
}
