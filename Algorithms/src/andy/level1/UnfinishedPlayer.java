package andy.level1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//프로그래머스 Level 1,
//완주하지 못한 선수
public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map1 = new HashMap<>();
        for(String d:participant) {
            if(map1.get(d) == null)
                map1.put(d,1);
            else
                map1.put(d,map1.get(d)+1);
        }
        for(String d:completion) {   
            map1.put(d,map1.get(d)+1);            
        }
        
        Iterator<String> mapIter = map1.keySet().iterator();
        while(mapIter.hasNext()){
            String key = mapIter.next();
            int value = map1.get( key );
            if(value % 2 == 1) return key;
        }
        
        return answer;
    }
}
