package andy.level1;

public class NoNumberPlus {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int d:numbers) answer += d;
        return 45-answer;
    }
}
