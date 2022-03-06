package level2.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//프로그래머스 Level 2,메뉴 리뉴얼
public class menuRenewal {

    public String stringOrder(String str) {
        char[] buf = str.toCharArray();
        Arrays.sort(buf);
        return new String(buf);
    }
    
    public void rec(Map<String,Integer> map,String fin, String str,int sz) {
        if(fin.length() == sz) {
            fin = stringOrder(fin);
            map.put(fin,map.getOrDefault(fin,0) + 1);
            return;
        }
        if(str.length() < 1) {
            return;
        }
        
        rec(map,fin+str.charAt(0),str.substring(1),sz);
        rec(map,fin,str.substring(1),sz);        
    }
    
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();

        
        for(int c:course) {
            Map<String,Integer> map = new HashMap<>();
            for(int i=0;i<orders.length;i++) {
                rec(map,"",orders[i],c);      
            }
            if(map.size() < 1) continue;
            int max = Collections.max(map.values());            
            if(max<2) continue;
            
            Iterator<String> mapIter = map.keySet().iterator();
            while(mapIter.hasNext()){
                String key = mapIter.next();
                int value2 = map.get( key );
                if(max == value2) list.add(key);
            }            
        }
        
        answer = list.toArray(new String[list.size()]);
        
        Arrays.sort(answer);
            
        return answer;
    }   
}
