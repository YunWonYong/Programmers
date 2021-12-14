import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
                
        int[] answer = {};
        int count = 0; // 나누어진 수 만큼 answer 초기화
        boolean flag = true; // -1 넣을까 말까 판단

        for (int i = 0; i < arr.length; i++) {

            // answer 초기화를 위해 사용 바로 값 넣고 싶지만 초기화 하지 않고는 ...
            if (arr[i] % divisor == 0) {
                count++;
            }

        }
        // 위의 반복문으로 계산한 거로 answer 배열 크기 초기화
        answer = new int[count];
        // 다시 count 사용하기 위해 0으로 초기화
        count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                answer[count] = arr[i];
                flag = false;
                count++;
            }

        }
        // 오름차순 정열 
        Arrays.sort(answer);
        // 나눠지는 게 없으면 -1 넣기 
        if (flag) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        
        
        return answer;
    }
}
