package level1.java;

//프로그래머스 Level 1,최대공약수와 최소공배수
public class gcdlcm {
    public int[] solution(int n, int m) {
        int[] answer = { 0,0 };
        answer[1] = n*m;
        
        int mod=0;
        while(true) {
            mod = n%m;
            if(mod==0) {
                answer[0] = m;
                break;   
            }
            n = m;
            m = mod;
        }
        answer[1] /= answer[0];
        return answer;
    }
}
