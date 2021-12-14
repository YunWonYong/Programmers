class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int num1 = a;
        int num2 = b;
        int count = 0;
        
        // 입력숫자 크기 비교 후 차이를 count로 주고 작은 수에서 count 만큼의 1씩 추가해서 더함 
        if (num1 >= num2) {
            count = num1 - num2;
            for (int i = num2; i <= count + num2; i++) {
                answer= answer + i;
            }
        } else if (num1 <= num2) {
            count = num2 - num1;
            for (int i = num1; i <= count + num1; i++) {
                answer = answer + i;
            }
        }
                 
        return answer;
    }
}
