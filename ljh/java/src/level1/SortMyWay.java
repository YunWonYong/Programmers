package level1;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 문자열 내 마음대로 정렬하기
 */

public class SortMyWay {
	
    public String[] solution(String[] strings, int n) {
    	int index = n;
    	
        Comparator<String> comp = new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) { 
        		int i = 0;
        		if(o1.charAt(index) - o2.charAt(index) != 0) {
        			return o1.charAt(index) - o2.charAt(index);
        		}
        		
        		while(o1.charAt(i)-o2.charAt(i) == 0) {
        			i++;
        		}
        		return o1.charAt(i) - o2.charAt(i);
        	}
        };
        
        Arrays.sort(strings, comp);
        return strings;
    }
}

