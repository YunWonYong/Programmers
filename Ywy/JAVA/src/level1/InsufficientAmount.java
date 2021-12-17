package level1;

public class InsufficientAmount {

	public InsufficientAmount() {
	}
	
    public long solution(int price, int money, int count) {
        long answer = 0;
        int cnt = 0;
        long temp = 0;
        do {
            temp += price * (++cnt);
        } while(cnt < count);
        answer = temp - money;
        return java.lang.Math.max(answer, 0);
    }
}
