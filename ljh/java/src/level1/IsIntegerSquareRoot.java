package level1;

/*
 * 정수 제곱근 판별 (220115 - 220121)
 */

public class IsIntegerSquareRoot {
    public long solution(long n) {
        double x = Math.sqrt(n);        
        return x % 1 == 0? (long)((x+1)*(x+1)) : -1;
    }
}
