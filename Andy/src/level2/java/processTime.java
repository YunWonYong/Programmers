package level2.java;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 Level 2,기능개발
public class processTime {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<Integer>();

        int d = (int)Math.ceil((100.0-progresses[0])/speeds[0]);
        int fin=1;
        for(int i=1;i<progresses.length;i++) {
            int ptime = (int)Math.ceil((100.0-progresses[i])/speeds[i]);
            if(d>=ptime) fin++;
            else {
                list.add(fin);
                fin=1;
                d = ptime;
            }
        }
        list.add(fin);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
