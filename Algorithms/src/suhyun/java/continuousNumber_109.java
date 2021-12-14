import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            // arr에 있는 원소들을 temp로 옮김
            temp.add(arr[i]);
            if (i > 0) {
                // 만약 겹치는 게 있으면 삭제
                if (arr[i] == arr[i - 1]) {
                    temp.remove(count);

                } else {
                    // temp의 삭제할 자릿수 계산용
                    count++;
                }

            }

        }
        //answer 배열에다가 temp 옮겨주기
        answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        

        return answer;
    }
}
