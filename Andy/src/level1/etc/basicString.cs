//프로그래머스 Level 1,문자열 다루기 기본
public class Solution {
    public bool solution(string s) {
        if(s.Length != 4 && s.Length != 6) return false;
        for(int i=0;i<s.Length;i++)
            if(s[i] < '0' || s[i] > '9') return false;
        return true;
    }
}
