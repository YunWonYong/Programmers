package level2.java;

//프로그래머스 Level 2,124 나라의 숫자
public class number124 {
    public String solution(int n) {
        StringBuffer answer = new StringBuffer();
        while(n>0) {
            int mod = n%3;
            answer.append((mod==0?4:mod));
            n = n/3 - (mod==0?1:0);
        }
        return answer.reverse().toString();
    }
}
