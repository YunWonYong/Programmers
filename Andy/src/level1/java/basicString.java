package level1.java;

//프로그래머스 Level 1,문자열 다루기 기본
public class basicString {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) <'0' || s.charAt(i) >'9') return false;
        }
        return true;
    }
}
