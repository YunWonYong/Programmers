package andy.level1;
//프로그래머스 Level 1,가운데 글자 가져오기
public class GetMiddleLetter {
    public String solution(String s) {
        return s.substring((s.length()-1)/2, (s.length()-1)/2 + 2 - s.length()%2);
    }

}
