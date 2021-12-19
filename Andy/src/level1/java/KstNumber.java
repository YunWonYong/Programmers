package level1.java;

import java.util.Arrays;

// 프로그래머스 Level 1,
// K번째수
public class KstNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx =0;
        for(int i=0;i<commands.length;i++) {
            int[] arr = commands[i];
            int[] tmp = Arrays.copyOfRange(array,arr[0]-1,arr[1]);
            Arrays.sort(tmp);            
            answer[idx++] = tmp[arr[2]-1];
        }
        return answer;
    }
}
