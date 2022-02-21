package level2.java;

import java.util.Arrays;

//프로그래머스 Level 2,타겟 넘버
public class targetNumber {
	public static int recursive(int[] numbers,int target,int idx) {
        if(idx >= numbers.length) {
        	if(Arrays.stream(numbers).sum() == target) return 1;
            return 0;
        }
        
        int sum = 0;
        sum += recursive(numbers,target,idx+1);
        numbers[idx] *= -1;
        sum += recursive(numbers,target,idx+1);  
        return sum;
	}
    public int solution(int[] numbers, int target) {
        return recursive(numbers,target,0);
    }
}
