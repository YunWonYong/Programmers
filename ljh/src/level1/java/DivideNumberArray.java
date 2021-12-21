package level1.java;

import java.util.ArrayList;
import java.util.List;

/*
 * 프로그래머스 - 나누어 떨어지는 숫자 배열
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환
 * 
 * - divisor는 자연수
 */

public class DivideNumberArray {
	public static void main(String[] args) {
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		int[] answer = solution(arr, divisor);
		for(int a : answer) {
			System.out.println(a);
		}
	}
	
    public static int[] solution(int[] arr, int divisor) {
    	List<Integer> alist = new ArrayList<Integer>();
    	int[] answer;
    	int index = 0;
    	int temp;
    	
    	for(int a : arr) {
    		if(a % divisor == 0) {
    			alist.add(a);
    		}
    	}
    	
    	// divisor로 나누어 떨어지는 element가 하나도 없다.
    	if(alist.isEmpty()) {
    		alist.add(-1);
    	}
    	
    	// ArrayList를 Array로 변환
    	answer = new int[alist.size()];
    	for(int a : alist) {
    		answer[index] = a;
    		index++;
    	}
    	
    	// 정렬
    	for(int i=0; i<answer.length-2; i++) {
    		for(int j=0; j<answer.length-1; j++) {
        		if(answer[j] > answer[j+1]) {
        			temp = answer[j];
        			answer[j] = answer[j+1];
        			answer[j+1] = temp;
        		}
    		}
    	}
    	
        return answer;
    }
}
