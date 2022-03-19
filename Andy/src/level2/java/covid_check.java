package level2.java;

import java.util.Arrays;
import java.util.HashSet;

//프로그래머스 Level 2,거리두기 확인하기
public class covid_check {

	public boolean isCheck(String[] arr,int x,int y) {       
    	int[][] map = new int[5][5];
    	Arrays.stream(map).forEach( a->Arrays.fill(a, 5));
   
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(x*10 + y);
    	int cnt = 0;
    	   	
    	while(true) {
    		HashSet<Integer> set2 = new HashSet<Integer>();
    		for(int d:set) {
    			int x1 = d/10;
    			int y1 = d%10;
    			
    			if(cnt>2 || x1<0 || y1<0 || x1>=5 || y1>=5) continue;
    			if(arr[x1].charAt(y1) == 'X') continue;
    			if(map[x1][y1] > cnt) {
    				map[x1][y1] = cnt;
                    if(arr[x1].charAt(y1) == 'P' && cnt != 0) return true;
    				
    				set2.add(x1*10 + y1+1);
    				set2.add(x1*10 + y1-1);
    				set2.add((x1+1)*10 + y1);
    				set2.add((x1-1)*10 + y1);
    			}
    		}
    		set = set2;
            cnt++;
    		
    		if(set.size() == 0) break;
    	}
    	
		return false;
	}
	
    public boolean isSafe(String[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[i].length();j++) {
    			if(arr[i].charAt(j) == 'P' && isCheck(arr,i,j) == true) {
    				return false;
    			};
    		}
    	}

        return true;
    }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];       
        int idx=0;
        for(String[] d:places) {
            if(isSafe(d) == true) answer[idx] = 1;
            else answer[idx] = 0;
            idx++;
        }
        
        return answer;
    }
}
