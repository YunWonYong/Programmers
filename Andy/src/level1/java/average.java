package level1.java;

import java.util.Arrays;

//프로그래머스 Level 1,평균 구하기
public class average {
    public double solution(int[] arr) {
        return (double)Arrays.stream(arr).sum() / arr.length;
    }
}
