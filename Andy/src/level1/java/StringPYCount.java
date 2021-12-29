package level1.java;

//프로그래머스 Level 1, 문자열 내 p와 y의 개수
public class StringPYCount {
    boolean solution(String s) {
        if( s.replaceAll("[^pP]","").length() == s.replaceAll("[^yY]","").length() ) return true;
        return false;
    }
}
