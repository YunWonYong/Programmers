package level1;

import semantics.Choice;

public class AddDigits {
	public AddDigits() {
		// TODO Auto-generated constructor stub
	}
	
	@Choice
	public int solution(int n) {
        int answer = 0;
        while(true){
            if(n == 0){
                return answer;
            }
            answer += n % 10;
            n /= 10;
        }
    }
	
	public int solution2(final int n) {
		String[] arr = String.valueOf(n).replaceAll("0", "").split("");
		int answer = 0;
		for (String el : arr) {
			answer += Integer.parseInt(el);
		}
		return answer;
	}
}
