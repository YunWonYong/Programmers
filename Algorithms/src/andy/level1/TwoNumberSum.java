package andy.level1;

//프로그래머스 Level 1,두 정수 사이의 합
public class TwoNumberSum {
    public long solution(int a, int b) {
        return (a+b)*(Math.abs(a-b)+1)/2;
    }
}
