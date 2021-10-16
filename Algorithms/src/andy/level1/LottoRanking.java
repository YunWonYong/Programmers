package andy.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class LottoRanking {
	public static void main(String[] args) {
		int[] lottos = {44,1,0,0,31,25};
		int[] win_nums = {31,10,45,1,6,19};
		
		int[] result = solution(lottos,win_nums);
		System.out.println("Max:" + result[0]+" Min:" +result[1]);
				
	}
	
    public static int[] solution(int[] lottos, int[] win_nums) {
    	int[] arr = { 6,6,5,4,3,2,1 };
        int[] answer = { 0,0 };
        int zcnt = 0;
        Set<Integer> set = new HashSet<>();
        for(int i:win_nums) 
        	set.add(i);
        for(int i:lottos) {
        	if(i==0)
        		zcnt++;
        	else
        		set.add(i);        	
        }
       
        int mmax = 12 - set.size();   
        answer[0] = arr[mmax];
        answer[1] = arr[mmax - zcnt];
        
        return answer;
    }
}
