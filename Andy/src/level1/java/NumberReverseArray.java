package level1.java;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 Level 1,자연수 뒤집어 배열로 만들기
public class NumberReverseArray {
    public int[] solution(long n) {     
        List<Integer> list = new ArrayList<Integer>();
        while(true) {
        	if(n == 0) break;
            list.add((int)(n%10));
            n /= 10;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();    
    }
}
