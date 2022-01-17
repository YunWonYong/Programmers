package level1.java;
//프로그래머스 Level 1,약수의 합
public class DivisorSum {
    public int solution(int n) {
        int answer = n;
        for(int i=1;i<=n/2;i++)
            answer += n%i==0?i:0;
        return answer;
    }
}
