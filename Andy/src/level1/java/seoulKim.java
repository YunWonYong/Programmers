package level1.java;
import java.util.Arrays;
import java.util.List;

//프로그래머스 Level 1,서울에서 김서방 찾기
public class seoulKim {
    public String solution(String[] seoul) {
        List<String> alist = Arrays.asList(seoul);
        return String.format("김서방은 %d에 있다",alist.indexOf("Kim"));
    }
}
