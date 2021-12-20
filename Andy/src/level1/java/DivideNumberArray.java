package level1.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//프로그래머스 Level 1,나누어 떨어지는 숫자 배열
public class DivideNumberArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<Integer>();
        for(int d:arr) {
            if(d%divisor == 0) {
                list.add(d);
            }                
        }        
        
        if(list.size() == 0) return answer;
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
