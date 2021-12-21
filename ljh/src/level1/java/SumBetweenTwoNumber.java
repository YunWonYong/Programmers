package level1.java;

/*
 * 프로그래머스 - 두 정수 사이의 합
 */
class SumBetweenTwoNumber {
    public long solution(int a, int b) {
        long answer = 0;
        long max = b;
        long min = a;

        if(a > b){
            max = a;
            min = b;
        }

        for(long i=min; i<=max; i++){
            answer += i;
        }

        return answer;
    }
}