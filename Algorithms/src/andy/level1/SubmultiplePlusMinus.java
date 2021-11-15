package andy.level1;

//프로그래머스 Level 1,약수의 개수와 덧셈
public class SubmultiplePlusMinus {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++) {
            int cnt = 1;
            for(int j=1;j<=i/2;j++) {
                if(i%j == 0) cnt++;
            }
            answer += cnt%2==0?i:-i;
        }        
        return answer;
    }
}
