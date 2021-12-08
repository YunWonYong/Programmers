package ywy.java.level1;

public class GetMiddleLetter {
    public String solution(String s) {
        int mid = s.length() / 2; 
        return s.substring(s.length() % 2 == 0 ? mid - 1: mid, mid + 1);
    }
}
