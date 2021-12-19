package level1.java;

public class NoNumberPlus {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int d:numbers) answer += d;
        return 45-answer;
    }
}
