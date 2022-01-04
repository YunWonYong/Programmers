using System;
//프로그래머스 Level 1,서울에서 김서방 찾기
public class Solution {
    public string solution(string[] seoul) {
        return String.Format("김서방은 {0}에 있다",Array.IndexOf(seoul, "Kim"));
    }
}
