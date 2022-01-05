package level1;
class 수박 {
	private final String s;
	private int currentAtIndex;
	private 수박() {
		s = "수박";
	}
	
	public static 수박 getInstance() {
		return new 수박();
	}
	
	public char nextAt() {
		if (s.length() == currentAtIndex) {
			currentAtIndex = 0;
		}
		return s.charAt(currentAtIndex++);
	}
}
public class InfinityWatermelon {
	
	public InfinityWatermelon() {}
	
	public String solution(int n) {
		StringBuilder answer = new StringBuilder();
		수박 watermelon = 수박.getInstance();
		while(--n > -1) {
			answer.append(watermelon.nextAt());
		}
		return answer.toString();
	}
}
