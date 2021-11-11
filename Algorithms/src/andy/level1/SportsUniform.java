package andy.level1;

import java.util.Arrays;

//프로그래머스 Level 1,체육복
public class SportsUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        
        for(int d:reserve) arr[d-1]++;
        for(int d:lost) arr[d-1]--;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] == 0) {
        		if(i>0 && arr[i-1]>1) answer++;
        		else if(i<arr.length-1 && arr[i+1]>1) { 
        			answer++;
        			arr[i+1]--;
        		}
        	}
        	else 
        		answer++;
        }
        
        return answer;
    }
}
