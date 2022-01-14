package level1;

/*
 * 자연수 뒤집어 배열로 만들기 (220108 - 220114) 
 */

public class ReverseNumber {
	
	public int[] solution(long n) {
		int[] answer = new int[(int)(Math.log10(n)+1)];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)(n%10);
			n /= 10;
		}
		
		return answer;
	}
}
