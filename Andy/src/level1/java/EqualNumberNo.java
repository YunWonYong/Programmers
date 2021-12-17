package level1.java;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 Level 1,같은 숫자는 싫어
public class EqualNumberNo {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] != arr[i+1])
            	list.add(arr[i]);
        }
        list.add(arr[arr.length-1]);   
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
