package FindRemainderNumeric1;

//프로그래머스 Level 1,나머지가 1이 되는 수 찾기
public class FindRemainderNumberic1 {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++)
            if((n-1)%i == 0) return i;
        return answer;
    }
}
