package level2.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

//프로그래머스 Level 2,튜플
public class ntuple {	
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<Integer>();
        s = s.substring(2,s.length()-2);
        String[] array = s.split("\\},\\{");
        Arrays.sort(array, new Comparator<String>() {
        	public int compare(String a, String b) {
        		return a.length() - b.length();
        	}
        });
        int prev=0;
        for(String str:array) {
            String[] tmp = str.split(",");
            int sum=0;
            for(String x:tmp) sum += Integer.parseInt(x);
            list.add(sum-prev);
            prev = sum;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();    
    }
}
