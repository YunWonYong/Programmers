package level1.java;

//프로그래머스 Level 1,정수 제곱근 판별
public class NumberSquareRoot {
    public long solution(long n) {
        long answer = (long)Math.sqrt((double)n);
        if(Math.pow((double)answer, 2) == n) return (long)Math.pow((double)(answer+1), 2);
        return -1;
    }
}
