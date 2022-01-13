package level1.java;
//프로그래머스 Level 1,이상한 문자 만들기
public class StrangeString {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        for(int i=0,j=0;i<arr.length;i++,j++) {
            answer += j%2==0?arr[i].toUpperCase():arr[i].toLowerCase();
            if(arr[i].compareTo(" ")==0) j=1;
        }            
        return answer;
    }
}
