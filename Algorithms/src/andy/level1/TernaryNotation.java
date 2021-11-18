package andy.level1;

//프로그래머스 Level 1,3진법 뒤집기
public class TernaryNotation {
    public int solution(int n) {
        int answer = 0;
        StringBuffer str = new StringBuffer();
        while(n>0) {
        	str.append(""+n%3);
            n /= 3;
        }
        answer = Integer.parseInt(str.toString(),3);
        return answer;
    }
}
