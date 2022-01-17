package level1.java;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 Level 1,제일 작은 수 제거하기
public class MinNumberRemove {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
    	if(arr.length <= 1) return answer;

    	List<Integer> alist = new ArrayList<Integer>();
    	int min = arr[0];
    	for(int d:arr) if(min>d) min = d;
    	for(int d:arr) if(d != min) alist.add(d);    	    	
        answer = alist.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
