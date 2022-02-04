package arrayAdd;

import java.util.Arrays;

//프로그래머스 Level 1,행렬의 덧셈
public class arrayAdd {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = Arrays.copyOf(arr1, arr1.length);
        for(int i=0;i<answer.length;i++) {
        	for(int j=0;j<answer[i].length;j++)
        		answer[i][j] += arr2[i][j];
        }
        return answer;
    }
}
