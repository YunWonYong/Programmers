package level1.java;
//프로그래머스 Level 1,자릿수 더하기 
public class NumberSum {
    public int solution(int n) {
        int answer = 0;
        String[] arr = ("" + n).split("");
        for(String d:arr) {
        	answer += Integer.parseInt(d);
        }
        return answer;
    }
}
